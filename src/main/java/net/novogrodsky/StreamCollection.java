package net.novogrodsky;

import java.util.Collection;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCollection {

    Collection<String> collection = Arrays.asList("a", "b", "c");
    Stream<String> streamOfCollection = collection.stream();

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

}
