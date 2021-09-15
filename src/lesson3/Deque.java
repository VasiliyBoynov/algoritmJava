package lesson3;

import java.util.Arrays;

public class Deque <T>{
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int left;
    private int right;


    public Deque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        list = (T[]) new Object[capacity];
    }

    public Deque(){
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty(){
        return (size()==0);
    }

    public boolean isFull(){
        return (size==list.length);
    }

    public int size(){
        return size;
    }

    private int nextIndex(int index){
        index++;
        return (index)% (list.length);}

    private int preIndex(int index){
        index--;
        return index<0 ? list.length - 1 : index;}

    private void increaseLength(){
        T[] listNew =(T[]) new Object[(int) (list.length*1.5+1)];
        if (left<right ){
            java.lang.System.arraycopy(list,left,listNew,0,list.length);

        } else {
            java.lang.System.arraycopy(list,left,listNew,0,list.length-left);
            java.lang.System.arraycopy(list,0,listNew,list.length-left,right+1);
            right=list.length-1;
            left=0;
        }
    list = listNew;
    }

    public void insertLeft(T item){
        boolean tmp = isEmpty();
        if (item==null) throw new IllegalArgumentException("item can't be \"NULL\"");
        else if (isFull()) {increaseLength();}
        size++;
        left = tmp ? 0 : preIndex(left);
        right = tmp ? 0 : right;
        list[left] = item;

    }

    public void insertRight(T item){
        boolean tmp = isEmpty();
        if (item==null) throw new IllegalArgumentException("item can't be \"NULL\"");
        else if (isFull()) {increaseLength();}
        size++;
        left = tmp ? 0 : left;
        right = tmp ? 0 :nextIndex(right);
        list[right]=item;
    }

    public T removeLeft(){
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
        size--;
        T tmp = list[left];
        list[left] = null;
        left = nextIndex(left);
        return tmp;
    }

    public T removeRight(){
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
        size--;
        T tmp = list[right];
        list[right] = null;
        right = preIndex(right);
        return tmp;
    }

    @Override
    public String toString() {
        return "{" +
                 Arrays.toString(list) +
                '}';
    }
}
