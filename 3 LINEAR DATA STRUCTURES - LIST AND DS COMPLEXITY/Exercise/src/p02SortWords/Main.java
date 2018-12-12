package p02SortWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> inputWords = Arrays
                .stream(reader.readLine().split(" "))
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        for (String inputWord : inputWords) {
            System.out.print(String.format("%s ", inputWord));
        }

    }
}
