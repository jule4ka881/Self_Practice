package day30_inheritance;

public class TestCryptoObjects {

    public static void main(String[] args) {


        CryptoToken crT1 = new CryptoToken(200,3,5,100.0,6,true);
        crT1.getPrice();
        crT1.totalPrice();
        System.out.println(crT1.getPrice());
        System.out.println((int)crT1.totalPrice());
    }
}
