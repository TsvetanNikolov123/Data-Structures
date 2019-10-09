package p05CountOfOccurrences;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> sequenceOfNumbers = new TreeMap<>();
        List<Integer> numbers;
        try {
            numbers = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .map(Integer::parseInt)

                    .collect(Collectors.toList());

            for (Integer number : numbers) {
                if (!sequenceOfNumbers.containsKey(number)) {
                    sequenceOfNumbers.put(number, 1);
                } else {
                    sequenceOfNumbers.put(number, sequenceOfNumbers.get(number) + 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : sequenceOfNumbers.entrySet()) {
                Integer currentNumber = entry.getKey();
                Integer count = entry.getValue();
                System.out.println(String.format("%d -> %d times", currentNumber, count));
            }
        } catch (Exception ignored) {
        }
    }
}
