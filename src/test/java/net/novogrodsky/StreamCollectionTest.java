package net.novogrodsky;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
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
        collectionUnderTest =objectUnderTest.returnStringCollection();
        Assertions.assertNotNull(collectionUnderTest);
        Assertions.assertTrue(collectionUnderTest.contains("a"));
    }

    @Test
    void returnStringStream() {
        Stream<String> streamUnderTest;
        streamUnderTest =objectUnderTest.returnStringStream();
        Assertions.assertNotNull(streamUnderTest);
        Assertions.assertTrue(streamUnderTest.anyMatch(element -> element.equals("a")));

        // putting this Assertion here causes and error, stream has already been closed
        // because of previous action on the stream.
        // Stream for applying sequence of operations in a functional style to elements,
        // not for data storage
        // Assertions.assertTrue(streamUnderTest.findFirst().equals("a"));
    }
}