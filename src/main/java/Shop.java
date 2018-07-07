import Instruments.*;
import Instruments.Instrument;
import Paraphernalia.*;

import java.util.ArrayList;

public class Shop {

    //        private ArrayList<Paraphernalia> accessoryStock;
    private ArrayList<Instrument> instrumentStock;
    private double till;

    public Shop(ArrayList instrumentStock, double till) {
        this.instrumentStock = new ArrayList<>();
        this.till = 0.00;
    }

    public int inventoryCount() {
        return this.instrumentStock.size();
    }

    public void addItem(Instrument guitar) {
        instrumentStock.add(guitar);
    }

    public void removeItem(Instrument guitar) {
        instrumentStock.remove(guitar);
    }

    public double getTotalProfits() {
        double profitMargin = 0.00;
        for (Instrument instrument : instrumentStock) {
            profitMargin += instrument.calculateMarkup();

        }
        return profitMargin;
    }

}


