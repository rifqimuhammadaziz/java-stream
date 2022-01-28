package rifqimuhammadaziz.stream.Collection;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
                .collect(Collectors.groupingBy(number -> {
                    if (number > 10) {
                        return "Big Number"; // group in string
                    } else {
                        return "Small Number"; // group in string
                    }
                }));
        System.out.println(collect);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<String>> map =  Stream.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord")
                .collect(Collectors.groupingBy(name -> {
                    if (name.length() > 4) {
                        return "Long Name";
                    } else {
                        return "Short Name";
                    }
                }));
        System.out.println(map);
    }

    @Test
    void testPartitioningBy() {
        // partitioningBy return value must be boolean
        Map<Boolean, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.partitioningBy(number -> {
                    return number > 8; // true : 9, 10
                }));
        System.out.println(collect);
    }

    @Test
    void testPartitioningBy2() {
        // partitioningBy return value must be boolean
        Map<Boolean, List<String>> map =  Stream.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord")
                .collect(Collectors.partitioningBy(name -> {
                    return name.length() > 4; // true : name length 5++
                }));
        System.out.println(map);
    }
}
