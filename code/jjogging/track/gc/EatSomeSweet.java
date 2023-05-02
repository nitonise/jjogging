package code.jjogging.track.gc;

import java.util.List;

public class EatSomeSweet {

    static class Sweet {}

    static class Cake extends Sweet {}

    static class Candy extends Sweet {}

    static class Chocolate extends Sweet {}

    record SweetBox(List<Sweet> sweets) {}

    public static void main(String[] args) {

        var cake = new Cake();
        var candy = new Candy();
        var chocolate = new Chocolate();

        var sweets = List.of(cake, candy, chocolate);

        var sweetBox = new SweetBox(sweets);

        // Some action.
        sweetBox.sweets.forEach(System.out::println);

        // When will GC be ready to "eat" all the sweet?
        // When there are no references to them.
        // Currently, each object is referenced 3 times.

        // Cutting refs off.
        // Suitable for the case.
        sweetBox = null;
        sweets = null;
        cake = null;
        candy = null;
        chocolate = null;
    }
}
