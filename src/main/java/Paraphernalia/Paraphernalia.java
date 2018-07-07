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

}