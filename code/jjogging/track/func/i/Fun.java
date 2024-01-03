package code.jjogging.track.func.i;

public class Fun {

    @FunctionalInterface
    interface FuncOne {
        int func(int arg);
    }

    @FunctionalInterface
    interface FuncTwo {
        int func(int arg);
    }

    // Non @FunctionalInterface
    interface FuncOver {
        int func(int arg1, int arg2);
        int func(int arg);
    }

    @FunctionalInterface
    interface FuncThree extends FuncOne, FuncTwo {}

    @FunctionalInterface
    interface FuncFour extends FuncThree, FuncOver {
        @Override
        default int func(int arg1, int arg2) {
            return arg1 + arg2;
        }
    }

    public static void main(String[] args) {

    }
}
