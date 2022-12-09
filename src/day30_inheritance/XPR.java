package day30_inheritance;

public class XPR extends CryptoToken{
    public XPR(double price, int quantity, double marketCap, double volume, int circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
