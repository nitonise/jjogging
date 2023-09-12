package code.jjogging.track.nestedness.access;

import java.util.stream.Stream;

public class AccessMe {
    public static void main(String[] args) {
        var item = new Item();
        var content = item.getContent();

        Stream.of(item, content).forEach(Metadata::print);
    }
}
