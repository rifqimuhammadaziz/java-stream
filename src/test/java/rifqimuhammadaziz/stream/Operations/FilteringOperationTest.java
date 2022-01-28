package rifqimuhammadaziz.stream.Operations;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {
    /**
     * Filtering Operation
     * Filter : get data depends on condition
     * Distinct : get data unique (cannot retrieve duplicated data) / delete duplicated data in next stream
     */

    @Test
    void testFilter() {
       List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord").stream()
               .filter(name -> name.length() > 5) // filter get name that has length > 5
               .forEach(System.out::println);

       List.of(1,5,9,2,90,24,35,67,77,29).stream()
               .filter(number -> number % 2 == 0) // filter get number that % 2 is 0
               .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Rifqi", "Rifqi", "Muhammad", "Aziz", "Aziz", "Xenosty", "Theord").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
