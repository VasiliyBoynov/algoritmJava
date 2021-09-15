package lesson3;


public class lesson3 {
    public static void main(String[] args) {
        task1Task3Task4();
        System.out.println(task2("это тест 12345"));


    }
    public static void task1Task3Task4(){
        Deque<Integer> deque = new Deque<Integer>(5);
        for (int i = 0; i < 10; i++) {
            if (i%2==0) deque.insertRight(i);
            else
                deque.insertLeft(i);
        }
        deque.removeLeft();
        deque.removeRight();
        while (!deque.isEmpty()){
            System.out.println(deque.removeLeft());
        }
    }
    public static String task2(String inputString){
        char[] arr = inputString.toCharArray();
        Deque<Character> steck = new Deque< Character >(arr.length);
        for (char c : arr) {
            steck.insertRight(c);
        }
        StringBuilder outputStr = new StringBuilder();
        while (!steck.isEmpty()){
            outputStr.append(steck.removeRight());
        }
        return outputStr.toString();
    }
}
