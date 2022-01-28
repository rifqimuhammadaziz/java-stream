package rifqimuhammadaziz.stream.Operations;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax() {
        List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord").stream()
                .max(Comparator.naturalOrder())// get first descending stream
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord").stream()
                .min(Comparator.naturalOrder())// get first ascending stream
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord").stream()
                .count(); // get total data of stream

        System.out.println(count);
    }

    @Test
    void testSum() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(result);

        // 0 (identity)
        // loop1. value=0 item=1 result=1
        // loop2. value=1 item=2 result=3
        // loop3. value=3 item=3 result=6
        // loop4. value=6 item=4 result=10
        // loop5. value=10 item=5 result=15
    }

    @Test
    void testFactorial() {
        var factorial = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);

        System.out.println(factorial);

        // 1 (identity)
        // loop1. value=1 item=1 result=1
        // loop2. value=1 item=2 result=2
        // loop3. value=2 item=3 result=6
        // loop4. value=6 item=4 result=24
        // loop5. value=24 item=5 result=120
    }
}
