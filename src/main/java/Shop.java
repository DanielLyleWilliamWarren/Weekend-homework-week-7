import Instruments.Guitar;
import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {

        private ArrayList<Instrument> stock;
        private int till;

        public Shop(ArrayList stock, int till){
            this.stock = new ArrayList<>();
            this.till = till;
        }

    public int inventoryCount() {
        return this.stock.size();
    }

    public void addItem(Guitar guitar) {
            stock.add(guitar);
    }

    public void removeItem(Guitar guitar) {
            stock.remove(0);
    }
}
