package day30_inheritance;

public class CryptoToken {

    private double price;
    private int quantity;
    private double marketCap;
    private double volume;
    private int circulatingSupply;
    private boolean isMineable;



    public CryptoToken(double price, int quantity, double marketCap, double volume, int circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;


    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Price is invalid");
            System.exit(1);
        }else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Quantity cannot be negative");

        } else {
            this.quantity = quantity;
        }
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if(marketCap<=0){
            System.err.println("Market cap cannot be zero");
        }
        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(int circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice() {
return getPrice()*getQuantity();          //method

    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                ",totalPrice=" + totalPrice() +
                '}';
    }
}

/*
1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can nt set to negative
					3. marketCap can not be zero

			methods:
				toString()
				totalPrice(): returns the total price of the crypto token ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset

 */