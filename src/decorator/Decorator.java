package decorator;

// 혼자 돌아가는 class가 아니고 다른 Decorator를 상속 받기 위해서 구현하기 때문에 abstract 선언
public abstract class Decorator extends Coffee {

    // Decorator는 혼자 들어 갈 수 없다. 또 다른 Decorator or 또 다른 컴포넌트를 가지고 있어야 한다.
    Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
