package day30_inheritance;

public class Bitcoin extends CryptoToken{
    public Bitcoin(double price, int quantity, double marketCap, double volume, int circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
