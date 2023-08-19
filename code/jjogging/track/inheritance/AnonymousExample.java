package code.jjogging.track.inheritance;

public class AnonymousExample {
    public static void main(String[] args) {

        var myPrinter = new Printer("MyPrinter") {
            static final Long MANUFACTURER_ID = 20L;

            @Override
            void print(String str) {
                System.out.println(str);
            }

            @Override
            String getModel() {
                return "Model: " + super.getModel();
            }
        };

        System.out.println(myPrinter.MANUFACTURER_ID);
        System.out.println(myPrinter.getModel());
        myPrinter.print("I'm working well");
    }

    static abstract class Printer {
        static final Long MANUFACTURER_ID = 10L;

        private final String model;

        Printer(String model) {
            this.model = model;
        }

        String getModel() {
            return model;
        }

        abstract void print(String str);
    }
}
