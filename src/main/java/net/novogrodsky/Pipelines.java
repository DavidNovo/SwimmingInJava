package net.novogrodsky;


import java.util.stream.Stream;

public class Pipelines {

    /**
     * Testing populating a stream using generate()
     */
    Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);

    /**
     * Testing populating a stream using iterate
     */
    Stream<Integer> streamIterated = Stream.iterate(0, n -> n + 2).limit(10);

    public Stream<Integer> getStreamIterated() {
        return streamIterated;
    }

    public Stream<String> getStreamGenerated() {
        return streamGenerated;
    }

    public void printStreamGenerated() {

        streamGenerated.forEach(n -> System.out.println(n));
    }

}
