package net.novogrodsky;

import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").build();
        streamBuilder.forEach(System.out::println);

        /*
         Stream<String> streamBuilder2 = (Stream<String>) Stream.<String>builder().add("a").add("b");
        // this does not work without casting the right side of the equation to Stream<String>,
        // in short I am not creating a Stream, I am creating a Builder.
        streamBuilder2.forEach(System.out::println);
        // I tried this code and I got this error when running it:
        Exception in thread "main" java.lang.ClassCastException: class java.util.stream.Streams$StreamBuilderImpl
        cannot be cast to class java.util.stream.Stream
        (java.util.stream.Streams$StreamBuilderImpl and java.util.stream.Stream
        are in module java.base of loader 'bootstrap')
        at net.novogrodsky.App.main(App.java:17)
    */
    }
}
