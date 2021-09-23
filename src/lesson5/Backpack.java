package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<Product> list;
    private int weight;
    private int size;
    private int coast;


    public Backpack(int weight) {
        this.weight = weight;
        list = new ArrayList<>();
        size=weight;
    }

    public boolean add(Product item){
        if (size- item.getWeight()<0) return false;
        list.add(item);
        size=size- item.getWeight();
        coast=coast+item.getPrice();
        return true;
    }

    public void clear(){
        size=weight;
        list.clear();

    }

}
