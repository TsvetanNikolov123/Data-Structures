package p02CalculateSequenceWithAQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class CalculateSequenceWithQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> queue = new LinkedList<>();
        queue.addLast(n);

        int index = 0;
        int[] members = new int[50];

        while (queue.size() > 0) {
            int element = queue.removeFirst();
            members[index] = element;
            index++;
            if (index == 50) {
                break;
            }

            queue.addLast(element + 1);
            queue.addLast(2 * element + 1);
            queue.addLast(element + 2);
        }

        System.out.println(Arrays.toString(members)
                .replace("[", "")
                .replace("]", ""));
    }
}
