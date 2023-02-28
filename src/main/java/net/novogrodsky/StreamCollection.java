package net.novogrodsky;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamCollection {

    Collection<String> collection = Arrays.asList("a", "b", "c");
    Stream<String> streamOfCollection = collection.stream();

    String[] rows = {"1 2 3", "2 4 6", "3 5 7"};
    String secondRow = "2 4 6";
    String thirdRow = "3 5 7";

    Collection<String> returnStringCollection() {
        return collection;
    }

    Stream<String> returnStringStream() {
        return streamOfCollection;
    }


    Stream<String> stream = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();


    List<List<Integer>> returnNewListOfList() {
        List<List<Integer>> arr = new ArrayList<>();

        int numberOfRows = 0;
        // note the upper bounds is exclusive by default, those
        // pesky 0 based index
        IntStream.range(0, 3).forEach(i -> {
            arr.add(
                    Stream.of(rows[numberOfRows].replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
            );
        });

        System.out.println(arr);
        return arr;
    }

    /**
     * @return a 2-d array of int primitives.
     */
    int[][] returnNewListOfListTwo() {

        int[][] array = Arrays.stream(rows)
                .map(row -> row.split(" "))
                .map(row -> Arrays.stream(row)
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .toArray(int[][]::new);

        //System.out.println(Arrays.deepToString(array)); // output: [[1, 2, 3], [2, 4, 6], [3, 5, 7]]

        return array;
    }

    /**
     * @return A 2-d List of Integer objects.
     */
    List<List<Integer>> returnNewListOfListThree() {

        List<List<Integer>> array = Arrays.stream(rows)
                .map(row -> Arrays.stream(row.split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());


        //System.out.println(Arrays.deepToString(array)); // output: [[1, 2, 3], [2, 4, 6], [3, 5, 7]]

        return array;
    }
}
