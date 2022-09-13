public class Main {
    public static void main(String[] args){

        // Abstraction

        // Make Car class

        Car car = new Car();

        car.honk();

        // Abstraction finished. This is all we see

        // Inheritance

        // Make FordFocus class

        FordFocus blueFocus = new FordFocus();

        // run this once, then override honk() method
        blueFocus.honk();

        // Polymorphism
        FordFocus fordFocus = new FordFocus();
        FordFiesta fordFiesta = new FordFiesta();

        fordFocus.honk();
        fordFiesta.honk();

        // What do you think is going to happen with the next snippet of code?
        Car anotherCar = fordFiesta;
        anotherCar.honk();
        // with calling methods, the actual object's method is called, not the reference's method.

        // Here is an idea of the power of polymorphism....

        Car cars[] = {fordFocus, fordFiesta};
        for(Car c : cars) {
            c.honk();
        }
        // method used is determined at runtime


        // Encapsulation

        fordFiesta.color = "pink";
        System.out.println(fordFiesta.color);

        // we can directly access the color property of the fordFiesta object from the main method
        // in the Main class

        // Generally, this is not good practice. We don't want other classes to be able to change our
        // object

        fordFiesta.setColor("pink");
        fordFiesta.getColor();


    }
}
