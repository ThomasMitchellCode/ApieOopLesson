public class Car {

    public String color = "blue";
    public int numberOfWheels = 4;

    // Change from public to private for encapsulation.

//    private String color = "blue";
//    private int numberOfWheels = 4;
//
//    // show that we get an error in main
//
//    public void getColor() {
//        System.out.println(color);
//    }
//
//    public void setColor(String newColor){
//        color = newColor;
//    }

    public void honk(){
        System.out.println("VERY LOUD HORN SOUNDS!!!!");
    }

    // Abstraction done.
}
