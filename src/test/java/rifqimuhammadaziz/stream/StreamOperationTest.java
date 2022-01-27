package rifqimuhammadaziz.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation() {
        /**
         * Stream Operation
         * Create new data (without change original of data) and do operation (ex. transform data string to uppercase)
         */
        List<String> names = List.of("Rifqi", "Muhammad", "Aziz");
        Stream<String> streamNames = names.stream(); // create stream from list
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase()); // transform data stream to uppercase

        streamUpper.forEach(System.out::println);
    }
}
