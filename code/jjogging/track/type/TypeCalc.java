package code.jjogging.track.type;

public class TypeCalc {
    static void func(Object o) {
        System.out.println("Object");
    }

    static void func(String s) {
        System.out.println("String");
    }

    public static void main(String[] args) {
        var o = new Object();
        var s = " ";
        func(true ? o : s);
        func(false ? o : s);

        Object o1 = s;
        System.out.println(o1.getClass());
    }
}
