import fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class BoxWithFruits<T extends Fruit> {
    private float weight;
    private List<T> listOfFruits = new ArrayList<>();

    public float getWeight() {
        return weight;
    }

    public BoxWithFruits(float weight) {
        this.weight = weight;
    }

    public void putFruit(T fruit) {
        listOfFruits.add(fruit);
        this.weight += fruit.getWeight();
    }
    public void mergeBox(BoxWithFruits<T> from){
        listOfFruits.addAll(from.listOfFruits);
        this.weight += from.getWeight();
        from = null;
    }
    public boolean compareByWeight(BoxWithFruits<?> b2) {
        if(this.getWeight() == b2.getWeight()) return true;
        return false;
    }

    public boolean compareByType(BoxWithFruits<?> b2) {
        if(this.getClass() == b2.getClass()) return true;
        return false;
    }

    public boolean compareByTypeAndWeight(BoxWithFruits<T> b2) { // типы должны совпадать
        if(getWeight() == b2.getWeight()) return true;
        return false;
    }
}
