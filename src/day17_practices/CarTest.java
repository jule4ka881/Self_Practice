package day17_practices;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("GL350","Mercedes",2012,"Black",15000);
        System.out.println(car1);
        car1.start();
    }
}
