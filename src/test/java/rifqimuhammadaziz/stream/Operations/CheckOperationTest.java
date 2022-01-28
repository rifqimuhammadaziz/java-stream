package rifqimuhammadaziz.stream.Operations;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {

    @Test
    void testAnyMatch() {
        boolean match = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,21).stream()
                .anyMatch(number -> number > 20); // true : any data at least have number > 20
        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        boolean match = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,21).stream()
                .allMatch(number -> number > 0); // true : all data must be > 0
        System.out.println(match);
    }

    @Test
    void testNoneMatch() {
        boolean match = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,21).stream()
                .noneMatch(number -> number > 20); // true : all data cannot more than 20
        System.out.println(match);
    }
}
