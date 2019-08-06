package gb.server;


import java.sql.*;

public class AuthService {

    static Connection connection = null;
    static String url = "jdbc:postgres://localhost:5432/userTestDB";
    static String name = "postgres";
    static String password = "root";
    static Statement statement = null;

    public static void connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Драйвер подключен");
            connection = DriverManager.getConnection(url, name, password);
            System.out.println("Соединение установлено");

            statement = connection.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String getNickByLoginAndPass(String login, String pass) {

        String sql = String.format("select nickname FROM userTable where" +
                " login = '%s' and password = '%s'", login, pass);
        try {
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
