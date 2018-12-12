package p01SumOfAverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> inputList = Arrays
                .stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double inputListSize = inputList.size();
        int sum = 0;

        for (Integer integer : inputList) {
            sum += integer;
        }

        double average = sum / inputListSize;

        System.out.println(String.format("Sum=%d; Average=%.2f", sum, average));
    }
}
