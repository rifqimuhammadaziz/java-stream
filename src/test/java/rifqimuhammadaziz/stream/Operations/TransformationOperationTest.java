package rifqimuhammadaziz.stream.Operations;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap() {
        // create stream from list of string > transform to integer (length of string)
        List.of("Rifqi", "Muhammad", "Aziz").stream()
                .map(myName -> myName.toUpperCase())
                .map(myUpperName -> myUpperName.length())
                .forEach(lengthName -> System.out.println(lengthName));
    }

    @Test
    void testFlatMap() {
        // create stream from list of string > transform to integer (length of string)
        List.of("Rifqi", "Muhammad", "Aziz").stream()
                .map(myName -> myName.toUpperCase())
                .flatMap(myUpperName -> Stream.of(myUpperName, myUpperName.length())) // transform to another stream (this line has 2 operations, get myUpperName & length)
                .flatMap(value -> Stream.of(value, value, value))// get 3x value from stream above
                .forEach(allData -> System.out.println(allData));

    }
}
