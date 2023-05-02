package decorator;

public class CoffeTest {
    public static void main(String[] args) {
        Coffee etiopiaAmericano = new EtiopiaAmericano();
        etiopiaAmericano.brewing();

        System.out.println();

        Coffee etiopiaLatte = new Latte(etiopiaAmericano);
        etiopiaLatte.brewing();

        Coffee etiopiaMochaLatte = new Mocha(new Latte(new EtiopiaAmericano()));
        etiopiaMochaLatte.brewing();

        System.out.println();

        Coffee kenyaMochaLatte = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMochaLatte.brewing();
    }
}
