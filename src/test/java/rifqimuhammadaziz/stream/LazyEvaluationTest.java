package rifqimuhammadaziz.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    /**
     * Intermediate & Terminal Operations
     */

    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("Rifqi", "Muhammad", "Aziz");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE"); // intermediate operation (stream not executed)
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Rifqi", "Muhammad", "Aziz");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE"); // intermediate operation (stream not executed)
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Add Mr. to " + upper); // intermediate operation (stream not executed)
                    return "Mr. " + upper;
                })
                .forEach(mr -> { // terminal operation (trigger to running intermediate operation)
                    System.out.println(mr);
                });
    }
}
