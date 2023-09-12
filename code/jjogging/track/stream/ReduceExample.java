package code.jjogging.track.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        var emptyList = new ArrayList<String>();
        var list = List.of("1", "2", "3", "4", "5");

        System.out.println(emptyList.stream().reduce(String::concat).orElse("0"));
        System.out.println(list.stream().reduce(String::concat).orElse("fail"));

        System.out.println(emptyList.stream().reduce("0", String::concat));
        System.out.println(list.stream().reduce("0", String::concat));

        System.out.println(emptyList.stream().reduce(0, (i, s) -> i + Integer.parseInt(s), Integer::sum));
        System.out.println(list.stream().reduce(0, (i, s) -> i + Integer.parseInt(s), Integer::sum));
        System.out.println(list.stream().parallel().reduce(0, (i, s) -> i + Integer.parseInt(s), (i1, i2) -> i1 * i2));
    }
}
