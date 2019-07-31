package fruits;

public class Fruit implements Comparable <Fruit>{
    private float weight;
    public float getWeight(){
        return this.weight;
    }

    @Override
    public int compareTo(Fruit o) {
        return Float.compare(this.weight, o.weight);
    }
}
