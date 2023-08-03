package factory.second;

// 직접 생성할 일 없음
public abstract class Car {

    String productName;

    public Car(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Car{" + "productName='" + productName + '\'' + '}';
    }
}
