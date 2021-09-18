package lesson4;

import java.util.List;

public class lesson4 {
    public static void main(String[] args) {
    task1();
    task2();
    }
    public static void task1(){
        MyLinkedList<Integer> mll = new MyLinkedList<Integer>();

        mll.insertFirst(5);
        mll.insertFirst(15);
        mll.insertFirst(25);
        mll.insertFirst(35);
        System.out.println(mll.indexOf(5));
        System.out.println(mll.indexOf(100));
    }
    public static void task2(){
        LinkedFIFO<String> fifo = new LinkedFIFO< String >();
        fifo.push("1");
        fifo.push("2");
        fifo.push("one");
        fifo.push("two");

    while (!fifo.isEmpty()){
        System.out.println(fifo.pop());
    }
    }


}
