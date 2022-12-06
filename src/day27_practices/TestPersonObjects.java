package day27_practices;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Rashid",28,'M',"German");
        Person person2 = new Person("Olga",32,'F',"German");
        System.out.println(person1);


        person1.printPlanetName();
        person1.eat("Burger");
        person1.drink("Pepsi");



    }
}
