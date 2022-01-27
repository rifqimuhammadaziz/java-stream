package rifqimuhammadaziz.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {
        // Stream Builder : add data manual one by one
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Rifqi");
        builder.add("Muhammad").add("Aziz");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        // Builder pattern (chaining)
        Stream<Object> stream = Stream.builder()
                .add("Rifqi").add("Muhammad").add("Aziz").build();

        stream.forEach(System.out::println);
    }
}
