package rifqimuhammadaziz.stream.Operations;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeekBefore() {
        List.of("Rifqi", "Muhammad", "Aziz").stream()
                .map(name -> {
                    System.out.println("Original Name : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Transform to Uppercase : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final Name : " + name));
    }

    @Test
    void testPeekAfter() {
        // more clean than before (peek is lazy | return value stream)
        List.of("Rifqi", "Muhammad", "Aziz").stream()
                .peek(name -> System.out.println("Original Name : " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Transform to Uppercase : " + upper)) // not terminal operator
                .forEach(name -> System.out.println("Final Name : " + name)); // terminal operator (trigger to run stream)
    }
}
