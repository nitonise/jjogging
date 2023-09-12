package code.jjogging.track.stream;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFreq {

    public static void main(String[] args) {
        var res = Stream.of("a", "a", "a", "b", "b", "c", "d").collect(Collectors.groupingBy(___ -> ___,
                Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(res);
    }
}
