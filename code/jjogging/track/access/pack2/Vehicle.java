package code.jjogging.track.access.pack2;

import code.jjogging.track.access.pack1.Car;

public class Vehicle extends Car {

    public static void main(String[] args) {
        var v = new Vehicle();
        v.test(v);
    }

    private void test(Car c) {
        super.drive();
    }
}
