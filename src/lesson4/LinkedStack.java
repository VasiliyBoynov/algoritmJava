package lesson4;

class LinkedFIFO<T> {
    private MyLinkedList<T> list;

    public LinkedFIFO() {
        list = new MyLinkedList<T>();
    }

    public void push(T item) {
        list.insertFirst(item);
    }

    public T pop() {
        return list.removeLast();
    }

    public T peek() {
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
