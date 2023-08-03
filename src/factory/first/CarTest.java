package factory.first;

public class CarTest {

    public static void main(String[] args) {

        CarTest test = new CarTest();
        Car car = test.produceCar("Sonata");

        System.out.println(car);
    }

    public Car produceCar(String name) {

        Car car = null;

        CarFactory factory = new CarFactory();
        car = factory.createCar(name);
        return car;
    }
}
