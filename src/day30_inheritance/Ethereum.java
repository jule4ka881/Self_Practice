package day30_inheritance;

public class Ethereum extends CryptoToken{
    public Ethereum(double price, int quantity, double marketCap, double volume, int circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
