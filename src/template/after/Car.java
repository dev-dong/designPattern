package template.after;

public abstract class Car {

    // final 키워드가 붙으면 재정의가 불가능하다.
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public abstract void drive();

    public abstract void stop();

    // 어떤 경우에는 구현하고 싶고, 어떤 경우에는 구현을 하고 싶지 않을때는 아래와 같이 선언
    public void washCar() {};

}
