package day27_practices;

public class TestIphoneObjects {
    public static void main(String[] args) {
        Iphone.printOperatingSystem();
        Iphone iphone1 = new Iphone("iphone 12","pro max","black",850);
        Iphone iphone2 = new Iphone("iphone 13","mini","purple",750);


        iphone1.call(327849949);
        iphone1.text(1213546788);

        iphone1.faceTime("cydeoschool@gmail.com");
        iphone2.faceTime(123344566);

        System.out.println(Iphone.designedIn);
        System.out.println(iphone1.model);
        System.out.println(iphone2.color);

    }
}
