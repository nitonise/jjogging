package code.jjogging.track.inheritance;

public class Constructor {

    static int counter = 1;

    static class Sup {
        Sup() {
            System.out.println("Sup:noargs > " + counter++);
        }

        Sup(String msg) {
            this();
            System.out.println("Sup:args > " + counter++);
        }
    }

    static class Sub extends Sup {
        Sub() {
            this("sub");
            System.out.println("Sub:noargs > " + counter++);
        }

        Sub(String msg) {
            super(msg);
            System.out.println("Sub:args > " + counter++);
        }
    }

    public static void main(String[] args) {
        new Sub();
    }
}
