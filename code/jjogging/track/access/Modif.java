package code.jjogging.track.access;

public class Modif {

    static class Foo {
        private void bar() {}
    }

    class Bar {
        private void baz() {}
    }

    void baz () {
        new Foo().bar();
        new Bar().baz();
    }

    public static void main(String[] args) {
        new Foo().bar();
    }
}
