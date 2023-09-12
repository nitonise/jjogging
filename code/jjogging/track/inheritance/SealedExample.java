package code.jjogging.track.inheritance;

public class SealedExample {

    static sealed class Root permits RootLeaf, Node {
        final String str = "ROOT";
    }

    static final class RootLeaf extends Root {}

    static sealed class Node extends Root permits NodeLeaf {}

    static non-sealed class NodeLeaf extends Node {}

    static class Foo extends NodeLeaf {}


    sealed interface Bar {
        void func();
    }

    enum Buz implements Bar {
        ONE;

        @Override
        public void func() {
            System.out.println("OK");
        }
    }

    final static class E implements Bar {
        @Override
        public void func() {

        }
    }

    public static void main(String[] args) {
        var root = new Root();
        var rootLeaf = new RootLeaf();
        var node = new Node();
        var nodeLeaf = new NodeLeaf();
        var foo = new Foo();

        System.out.printf(
                """
                root:       %s
                rootLeaf:   %s
                node:       %s
                nodeLeaf:   %s
                foo:        %s
                %n""",
                root.str,
                rootLeaf.str,
                node.str,
                nodeLeaf.str,
                foo.str);

        Buz.ONE.func();
    }
}
