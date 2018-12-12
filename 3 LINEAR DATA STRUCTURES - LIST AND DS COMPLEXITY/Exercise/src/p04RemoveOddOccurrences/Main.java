package p04RemoveOddOccurrences;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> sequenceOfNumbers = new LinkedHashMap<>();
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

            for (Integer number : numbers) {
                int asd = sequenceOfNumbers.get(number);
                if (sequenceOfNumbers.get(number) % 2 == 0) {
                    System.out.print(number + " ");
                }
            }
        } catch (Exception ignored) {
        }
    }
}
