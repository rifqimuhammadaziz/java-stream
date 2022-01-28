package rifqimuhammadaziz.stream.Collection;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    Stream<String> getStream() {
        return Stream.of("Rifqi", "Muhammad", "Aziz");
    }

    @Test
    void testCollection() {
        Set<String> set = getStream().collect(Collectors.toSet()); // stream to set
        System.out.println(set);
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet()); // stream to immutable set
        System.out.println(immutableSet);

        List<String> list = getStream().collect(Collectors.toList()); // stream to list
        System.out.println(list);
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList()); // stream to immutable list
        System.out.println(immutableList);
    }

    @Test
    void testCollectorsMap() {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                key -> key,
                value -> value.length()
        ));
        System.out.println(map);
    }
}
