package Paraphernalia;

public abstract class Paraphernalia {

    private double stockPrice;
    private double retailPrice;
    private String productDescription;

    public Paraphernalia(double stockPrice, double retailPrice, String productDescription){
        this.stockPrice = stockPrice;
        this.retailPrice = retailPrice;
        this.productDescription = productDescription;

    }

    public double getStockPrice() {
        return this.stockPrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public double calculateMarkup() {
        return this.retailPrice - this.stockPrice;
    }
}