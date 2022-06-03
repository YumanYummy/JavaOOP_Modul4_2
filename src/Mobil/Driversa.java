package Mobil;

public class Driversa {
    public static void main(String[] args) {
        Engine engine1 = new Engine("V8","Chevy","320 BHP");
        Car c = new Car("Red", engine1);
        System.out.println("Engine Power: " +c.getEngine().getPower());
    }
}
