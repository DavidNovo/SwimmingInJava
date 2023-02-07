package net.novogrodsky;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PipelinesTest {

    Pipelines testPipelines;

    @BeforeEach
    void setUp() {
        testPipelines = new Pipelines();
    }

    @AfterEach
    void tearDown() {
        testPipelines = null;
    }

    @Test
    void testMemberStreams() {


        assertNotNull(testPipelines.streamIterated);

        assertTrue(testPipelines.streamIterated.count() == 10);


        //assertTrue(testPipelines.streamIterated.findFirst().equals(0));
        // the above test does not work because:
        //java.lang.IllegalStateException: stream has already been operated upon or closed
    }

    @Test
    void testPrintoutStreamGenerates() {

        assertNotNull(testPipelines.getStreamGenerated());

        // if I put this command here:
        //assertTrue(testPipelines.streamGenerated.count() == 10);
        // the next line throws an error because:
        // java.lang.IllegalStateException: stream has already been operated upon or closed
        // it does not matter where the operation on the Stream is
        testPipelines.printStreamGenerated();
    }
}