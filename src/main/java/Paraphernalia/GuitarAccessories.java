package Paraphernalia;

public class GuitarAccessories extends Paraphernalia {
    private GuitarAccessoryType type;

    public GuitarAccessories(GuitarAccessoryType type, double stockPrice, double retailPrice, String productDescription){
        super(stockPrice, retailPrice, productDescription);
        this.type = type;
    }

    public GuitarAccessoryType getStrings() {
        return this.type;
    }
}
