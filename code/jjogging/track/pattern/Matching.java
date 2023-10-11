package code.jjogging.track.pattern;

public class Matching {

    static class Bar {
        void baz() {
            System.out.println("Hello, World!");
        }
    }

    public static void main(String[] args) {
        Object obj = new Bar();

        System.out.println(obj.getClass());

        if (obj instanceof Bar b)
            b.baz();
        else
            System.out.println("O_O");
        //==================================================//

        Object str = "true";

        if (!(str instanceof String s))
            System.out.println("not a String");
        else
            System.out.println("String " + s);

        if (str instanceof Number s)
            System.out.println("Number " + s);
        //==================================================//

        Object o = 10;

        if (!(o instanceof Number n))
            throw new RuntimeException("It is not a number");

        System.out.println(o);
    }
}
