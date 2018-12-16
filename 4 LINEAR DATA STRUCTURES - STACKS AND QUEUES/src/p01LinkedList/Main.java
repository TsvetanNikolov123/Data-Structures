package p01LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(1);
        list.addLast(2);

        for (Integer item : list) {
            System.out.println(item);
        }
    }
}
