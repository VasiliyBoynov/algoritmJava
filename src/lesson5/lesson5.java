package lesson5;

import java.util.ArrayList;
import java.util.List;

public class lesson5 {
    public static void main(String[] args) {
    //task1();
        task2();

    }
    public static void task1(){
        System.out.println(pow(5,2));
        System.out.println(pow(0,10));
        System.out.println(pow(0,0));
        System.out.println(pow(2,10));
    }
    public static long pow(int x, int y){
        if (y == 0) return (long)1;
        if (x == 0) return (long)0;
        return (long)(pow(x,y-1)*x);
    }

    public static void task2(){
        String str = "task2";
        Product[] listProduct = new Product[10];
        List<Integer> list = new ArrayList< >();
        for (int i = 0; i < 10; i++) {
            Product product = new Product((int)(Math.random()*100),(int)((Math.random()*100)));
            listProduct[i]= product;
            list.add(i);

        }
        System.out.println(list);

        list.add(0,list.get(list.size()-1));
        list.remove(list.size()-1);
        System.out.println(list);


    }

    private static void shift(List<Product> products){
        products.add(products.get(products.size()-1));
        products.remove(products.size()-1);
    }

}



