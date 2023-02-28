package net.novogrodsky;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

class StreamCollectionTest {

    StreamCollection objectUnderTest;

    @BeforeEach
    void setUp() {
        objectUnderTest = new StreamCollection();

    }

    @AfterEach
    void tearDown() {
        objectUnderTest = null;
    }

    @Test
    void returnStringCollection() {
        Collection<String> collectionUnderTest;
        collectionUnderTest = objectUnderTest.returnStringCollection();
        Assertions.assertNotNull(collectionUnderTest);
        Assertions.assertTrue(collectionUnderTest.contains("a"));
    }

    @Test
    void returnStringStream() {
        Stream<String> streamUnderTest;
        streamUnderTest = objectUnderTest.returnStringStream();
        Assertions.assertNotNull(streamUnderTest);
        Assertions.assertTrue(streamUnderTest.anyMatch(element -> element.equals("a")));

        // putting this Assertion here causes and error, stream has already been closed
        // because of previous action on the stream.
        // Stream for applying sequence of operations in a functional style to elements,
        // not for data storage
        // Assertions.assertTrue(streamUnderTest.findFirst().equals("a"));
    }

    @Test
    void returnNewListOfList() {
        objectUnderTest.returnNewListOfList();
        // this returns this: [[1, 2, 3], [1, 2, 3], [1, 2, 3]] list notation.
        // note the commas added

    }

    @Test
    void returnNewListOfListTwo() {
        int [][] array =objectUnderTest.returnNewListOfListTwo();
        System.out.println(Arrays.deepToString(array));
    }

    @Test
    void returnNewListOfListThree() {
        List<List<Integer>> array =objectUnderTest.returnNewListOfListThree();
        // this returns this: [[1, 2, 3], [2, 4, 6], [3, 5, 7]] list notation.
        // note the commas added, if this was an array of primitives, then I would get
        // an object address
        System.out.println(array.toString());
    }
}