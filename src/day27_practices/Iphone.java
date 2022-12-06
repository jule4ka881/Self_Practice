package day27_practices;

public class Iphone {

    public static String brand;

    public String model;
    public String size;
    public String color;
    public int price;
    public static String os;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;

    public Iphone(String model, String size, String color, int price) {

        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;

    }
        static{
            brand = "Iphone";
            os = "IOS";
            isSmartPhone = true;
            madeIn = "Taiwan";
            designedIn = "China";
        }
        public static void printOperatingSystem(){
            System.out.println("Iphone's operating system is "+ os);
        }
        public void call(long phoneNumber){
            System.out.println(model + " Model iphone calling " + +phoneNumber);
        }
        public void text(long phoneNumber) {
            System.out.println(model+" Model Iphone texting " + phoneNumber);
        }
        public void faceTime(long phoneNumber){
            System.out.println(model+ " Model iPhone does faceTime with "+phoneNumber);
        }
        public String faceTime(String email){
            return model + " is doing face time through email "+ email;
        }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
    Create a class named Iphone
        variables:
        brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

        Add a constructor to initialized all the fields

        Add a static block to initialize all the statics

        Methods:
        printOperatingSystem(): displays the operating system of the iphone
        call(long phoneNumber)
        text(long phoneNumber)
        faceTime(long phoneNumber)
        faceTime(String email)
        toString()
        */

