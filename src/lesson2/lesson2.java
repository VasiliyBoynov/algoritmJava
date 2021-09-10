package lesson2;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Date;

public class lesson2 {
    final static int sizeSample = 10;
    final static int sizeElement = (int) Math.pow( 10, 6);
    static int [] a;
    static long[] timeSortBubbleSort;
    static long[] timeInsertionSort;
    static long[] timeSelectionSort;
    static Date startTime;
    static Date stopTime;

    public static void main(String[] args) {
        init(sizeElement);
        System.out.println("колличество элементов в исходном массиве"+a.length);
        testBubbleSort();
        testInsertionSort();
        testSelectionSort();



        System.out.println("Среднее время сортировки пузырьковым методом: "+Arrays.stream(timeSortBubbleSort).average()+"мс");
        System.out.println("Среднее время сортировки методом вставки: "+Arrays.stream(timeInsertionSort).average()+"мс");
        System.out.println("Среднее время сортировки методом выбора: "+Arrays.stream(timeSelectionSort).average()+"мс");
    }

    public static void init(int sizeElement){
        a = new int[sizeElement];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*Math.pow( 10, 6));
        }
    }

    public static void testBubbleSort(){

        timeSortBubbleSort = new long[sizeSample];
        for (int i = 0; i < sizeSample; i++) {
            MyArray test = new MyArray();
            for (int item : a) {
                test.add(item);
            }
            //System.out.println("size: " + test.size());
            startTime = new Date();
            test.bubbleSort();
            stopTime = new Date();
            timeSortBubbleSort[i]= stopTime.getTime()-startTime.getTime();
            //System.out.println("start: "+ startTime.getTime() + " stop: "+ stopTime.getTime() + " itog: "+ timeSortBubbleSort[i]);
        }
    }

    public static void testInsertionSort(){

        timeInsertionSort = new long[sizeSample];
        for (int i = 0; i < sizeSample; i++) {
            MyArray test = new MyArray();
            for (int item : a) {
                test.add(item);
            }
            //System.out.println("size: " + test.size());
            startTime = new Date();
            test.bubbleSort();
            stopTime = new Date();
            timeInsertionSort[i]= stopTime.getTime()-startTime.getTime();
            //System.out.println("start: "+ startTime.getTime() + " stop: "+ stopTime.getTime() + " itog: "+ timeSortBubbleSort[i]);
        }
    }

    public static void testSelectionSort(){

        timeSelectionSort = new long[sizeSample];
        for (int i = 0; i < sizeSample; i++) {
            MyArray test = new MyArray();
            for (int item : a) {
                test.add(item);
            }
            //System.out.println("size: " + test.size());
            startTime = new Date();
            test.bubbleSort();
            stopTime = new Date();
            timeSelectionSort[i]= stopTime.getTime()-startTime.getTime();
            //System.out.println("start: "+ startTime.getTime() + " stop: "+ stopTime.getTime() + " itog: "+ timeSortBubbleSort[i]);
        }
    }

}
