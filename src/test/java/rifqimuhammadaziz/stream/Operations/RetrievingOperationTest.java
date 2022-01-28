package rifqimuhammadaziz.stream.Operations;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {
    /**
     * Retrieving Operation
     *
     */

    @Test
    void testLimit() {
        List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord").stream()
                .limit(3) // get 3 first of data
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord").stream()
                .skip(3) // skip/ignore 3 first of data
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord").stream()
                .takeWhile(name -> name.length() <= 5) // when condition is false, operation is stopped
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord", "Bayu", "Bagas").stream()
                .dropWhile(name -> name.length() <= 5) // skip data when condition is true
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        // retrieving single element : get any data of stream
        Optional<String> optional = List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord", "Bayu", "Bagas").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        // retrieving single element : get first data of stream
        Optional<String> optional = List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord", "Bayu", "Bagas").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}
