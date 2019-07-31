//Студент: Серов Вячеслав
//Домашняя работа №1
/*
1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
2. Написать метод, который преобразует массив в ArrayList;
3. Большая задача:
a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можете использовать ArrayList;
d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
g. Не забываем про метод добавления фрукта в коробку.

*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import fruits.*;


public class Solution {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(arrToArrList(arr).getClass());
        BoxWithFruits<Orange> boxOrangesOne = new BoxWithFruits<Orange>(0);
        BoxWithFruits<Apple> boxApplesOne = new BoxWithFruits<Apple>(0);

    }
    static void arrSwap(Integer[] arr) {
        try {
            if (arr.length>1){
                Integer temp = arr[0];
                arr[0] = arr[1];
                arr[1] = arr[0];
            }
            else System.out.println("Wrong array capacity.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Integer> arrToArrList(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        for (int member: arr
             ) {
            arrList.add(member);
        }
        return arrList;
    }
}
