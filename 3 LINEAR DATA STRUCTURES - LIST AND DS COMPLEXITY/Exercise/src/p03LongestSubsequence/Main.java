package p03LongestSubsequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers;
        try {
            numbers = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(0);
            return;
        }

        int maxCountNumber = 0;
        int maxCount = 0;
        for (int i = 0; i < numbers.size(); i++) {

            int tmpCount = 1;
            int tempNumber = numbers.get(i);

            for (int j = i + 1; j < numbers.size(); j++) {
                if (tempNumber == (numbers.get(j))) {
                    tmpCount++;
                } else {
                    break;
                }
            }

            if (tmpCount > maxCount) {
                maxCountNumber = tempNumber;
                maxCount = tmpCount;
            }
        }

        if (maxCount == 0) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < maxCount; i++) {

            if (i == maxCount - 1){
                System.out.println(maxCountNumber);
                return;
            }

            System.out.print(maxCountNumber + " ");
        }
    }
}
