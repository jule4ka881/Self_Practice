package day30_inheritance;

public class Cardano extends CryptoToken{
    public Cardano(double price, int quantity, double marketCap, double volume, int circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
