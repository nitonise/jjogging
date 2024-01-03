package code.jjogging.track.inheritance;

public class Abstraction {
    interface Foo {
        default void baz() {
            System.out.println("Foo");
        };
    }

    abstract static class Bar implements Foo {
        public abstract void baz();
    }

    static class FooBar extends Bar {

        @Override
        public void baz() {
            System.out.println("FooBar");;
        }
    }

    public static void main(String[] args) {
        new FooBar().baz();
    }
}
