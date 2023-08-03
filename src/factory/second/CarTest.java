package factory.second;

public class CarTest {

    public static void main(String[] args) {

        CarTest test = new CarTest();
        Car car = test.produceCar("Sonata");

        System.out.println(car);
    }

    public Car produceCar(String name) {

        Car car = null;

        CarFactory factory = new HyundaiFactory();
        car = factory.createCar(name);
        return car;
    }
}
