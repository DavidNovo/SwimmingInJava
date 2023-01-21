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
        Collection<String> streamUnderTest;
        streamUnderTest =objectUnderTest.returnStringCollection();
        Assertions.assertNotNull(streamUnderTest);
    }

    @Test
    void returnStringStream() {
        Stream<String> collectionUnderTest;
        collectionUnderTest =objectUnderTest.returnStringStream();
        Assertions.assertNotNull(collectionUnderTest);
    }
}