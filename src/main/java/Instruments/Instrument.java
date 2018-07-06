package Instruments;

import Behaviours.IPlay;

public abstract class Instrument {
    private String material;
    private String colour;
    private InstrumentType type;
    private double stockPrice;
    private double retailPrice;
    private String productDescription;

    public Instrument(InstrumentType type, String colour, String material, double stockPrice, double retailPrice, String productDescription){
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.stockPrice = stockPrice;
        this.retailPrice = retailPrice;
        this.productDescription = productDescription;
    }

    public InstrumentType getType() {
        return this.type;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour(){
        return this.colour;
    }

    public double getStockPrice() {
        return this.stockPrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

    public double calculateMarkup(){
        return getRetailPrice()-getStockPrice();
    }

    public String getProductDescription() {
        return this.productDescription;
    }
}
