package rifqimuhammadaziz.stream.Operations;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStreamBasic() {
        // Basic operations
        List<String> list = List.of("Rifqi", "Muhammad", "Aziz");

        Stream<String> stream = list.stream(); // transform stream from list

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase()); // transform data stream to uppercase
        Stream<String> streamMr = streamUpper.map(upper -> "Mr. " + upper); // add words in data uppercase
        streamMr.forEach(System.out::println); // print data
    }

    @Test
    void testCreateStreamPipeline() {
        List<String> list = List.of("Rifqi", "Muhammad", "Aziz");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr. " + upper)
                .forEach(System.out::println);
    }
}
