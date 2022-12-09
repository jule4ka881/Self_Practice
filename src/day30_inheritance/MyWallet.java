package day30_inheritance;

public class MyWallet {
    public static void main(String[] args) {


        Bitcoin bitcoin1 = new Bitcoin(100, 3, 500.0, 100.0, 4, false);
        XPR xpr1 = new XPR(100, 3, 500.0, 100.0, 4, false);
        Doge doge1 = new Doge(100, 3, 500.0, 100.0, 4, false);
        Ethereum ethereum1 = new Ethereum(100, 3, 500.0, 100.0, 4, false);
        Cardano cardano1 = new Cardano(100, 3, 500.0, 100.0, 4, false);

//        bitcoin1.totalPrice();
//        xpr1.totalPrice();
//        doge1.totalPrice();
//        ethereum1.totalPrice();
//        cardano1.totalPrice();
        double sum = bitcoin1.totalPrice()+
        xpr1.totalPrice()+
        doge1.totalPrice()+
        ethereum1.totalPrice()+
        cardano1.totalPrice();

        System.out.println(sum);
    }

}
