package p06ImplementDataStructureReversedListT;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReversedList<Integer> reversedList = new ReversedList<>();

        reversedList.add(10);
        reversedList.add(5);
        reversedList.add(6);
        reversedList.add(3);
        reversedList.add(2);
        reversedList.add(9);

        System.out.println(reversedList.capacity());
        System.out.println(reversedList.count());

        reversedList.removeAt(3);

        Iterator<Integer> iterator = reversedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
