import Instruments.*;
import Paraphernalia.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<Instrument> instrumentStock;
//    ArrayList<Paraphernalia> accessoryStock;
    Guitar guitar;
    Piano piano;
    Saxaphone saxaphone;
    Customer customer;
//    BrassPolish polish;
//    SheetMusic sheetMusic;
//    GuitarStrings strings;


    @Before
    public void setup(){
//        sheetMusic = new SheetMusic( 10.00, 20.00, "Sheet Music");
//        strings = new GuitarStrings(5.00, 10.00, "Guitar Strings");
//        polish = new BrassPolish(5.00, 7.50, "Makes Brass Shine");
        guitar = new Guitar(InstrumentType.STRING, "Wood", "Beige", 200.00, 300.00, "Gibson Les Paul");
        piano = new Piano(InstrumentType.KEYS, "Oak and Ivory", "Hazelnut brown case, black and white keys", 1000.00, 1500.00, "Grand Piano");
        saxaphone = new Saxaphone(InstrumentType.BRASS, "Brass", "Gold", 500.00, 750.00, "Gerry Rafferty's Sax");
        customer = new Customer("Dan", 1000.00);
        instrumentStock = new ArrayList();
        shop = new Shop(instrumentStock,0.00);
    }

    @Test
    public void canAddItemsToStock__Instruments(){
        shop.addItem(guitar);
        assertEquals(1, shop.inventoryCount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.inventoryCount());
    }

    @Test
    public void canGetTotalProfitOfItems(){
        shop.addItem(guitar);
        shop.addItem(piano);
        assertEquals(600.00, shop.getTotalProfits(),1);
    }

    @Test
    public void hasTill(){
        assertEquals(0.00, shop.getTill(), 1);
    }

    @Test
    public void tillIncreasesWhenItemRemoved(){
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(300.00, shop.getTill(),1);
    }

//    @Test
//    public void CustomerCanBuyItem(){
//        shop.addItem(saxaphone);
//        shop.sellItem(saxaphone);
//        shop.removeItem(saxaphone);
//        assertEquals(750.00, shop.getTill(),1);
//        assertEquals(250, customer.getWallet());
//    }



}
