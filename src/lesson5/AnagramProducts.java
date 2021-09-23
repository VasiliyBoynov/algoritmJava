package lesson5;

import java.util.ArrayList;
import java.util.List;

public class AnagramProducts {
    private int size;
    private int count;
    private List<Product> products;
    private List<List<Product>> out;

    public AnagramProducts(List<Product> products) {
        this.products = products;
    }

    private void getAnagram(){
        for (int i = 0; i < products.size(); i++) {
            shift();
        }
    }

    private  List <Product> anagram(List <Product> list){
        if (list.size()==1) return list;
        return null;
    }

     /*
     for (int i=0;i<newSize;i++){
        getAnagramm(newSize-1);
        if (newSize == 2)
            display();
        rotate(newSize);
    }
*/

    private void shift(){
        products.add(0,products.get(products.size()-1));
        products.remove(products.size()-1);
    }
}
