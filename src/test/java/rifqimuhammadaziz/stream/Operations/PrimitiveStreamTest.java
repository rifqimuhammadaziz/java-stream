package rifqimuhammadaziz.stream.Operations;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {

    @Test
    void testCreate() {
        // primitive integer stream
        IntStream intStream = IntStream.range(1, 200);
        intStream.forEach(System.out::println);

        // primitive long stream
        LongStream longStream = LongStream.of(1,2,3,4,5,6,7);
        longStream.forEach(System.out::println);

        // primitive double stream
        DoubleStream doubleStream = DoubleStream.builder().add(1.2).add(7.1).build();
    }

    @Test
    void testPrimitiveStreamOperation() {
        IntStream intStream = IntStream.range(1, 100);

        OptionalDouble optionalDouble = intStream.average();
        optionalDouble.ifPresent(System.out::println);

        IntStream.range(0, 100)
                .mapToObj(number -> "Number : " + number)
                .forEach(System.out::println);
    }
}
