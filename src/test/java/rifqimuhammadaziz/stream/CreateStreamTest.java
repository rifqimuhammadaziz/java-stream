package rifqimuhammadaziz.stream;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty(); // empty stream
        emptyStream.forEach(data -> {
            System.out.println(data); // print empty string
        });

        Stream<String> oneStream = Stream.of("Xenosty"); // one stream (cannot be null)
        oneStream.forEach(data -> {
            System.out.println(data); // print oneStream
        });

        String data = "Rifqi";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data); // stream can be null
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord");
        arrayStream.forEach(name -> System.out.println(name));

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
        integerStream.forEach(System.out::println);

        String[] stringArray = new String[]{
                "Rifqi", "Muhammad", "Aziz"
        };
        Stream<String> streamFromArray = Arrays.stream(stringArray); // create stream from array (convert array to string)
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Rifqi", "Muhammad", "Aziz");
        Stream<String> stringStream = collection.stream(); // convert collection to stream
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Xenosty");
        // stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1); // value++
        // iterate.forEach(System.out::println);
    }
}
