import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<Instrument> inventory;
    Guitar guitar;
    Piano piano;
    Saxaphone saxaphone;


    @Before
    public void setup(){
        guitar = new Guitar(InstrumentType.STRING, "Wood", "Beige", 200.00, 300.00, "Gibson Les Paul");
        piano = new Piano(InstrumentType.KEYS, "Oak and Ivory", "Hazelnut brown case, black and white keys", 1000.00, 1500.00, "Grand Piano");
        saxaphone = new Saxaphone(InstrumentType.BRASS, "Brass", "Gold", 500.00, 750.00, "Gerry Rafferty's Sax");
        inventory = new ArrayList();
        inventory.add(guitar);
        shop = new Shop(inventory, 0);
    }

    @Test
    public void canAddItemsToStock(){
        shop.addItem(guitar);
        assertEquals(1, shop.inventoryCount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.inventoryCount());
    }

}
