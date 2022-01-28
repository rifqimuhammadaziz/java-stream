package rifqimuhammadaziz.stream.Operations;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord").stream()
                .sorted() // sort ascending string
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord").stream()
                .sorted(reverseComparator) // sort descending string
                .forEach(System.out::println);
    }
}
