import Instruments.Saxaphone;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {
    Saxaphone saxaphone;

    @Before
    public void setup(){
        saxaphone = new Saxaphone(InstrumentType.BRASS, "Brass", "Gold", 500.00, 750.00, "Gerry Rafferty's Sax");
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.BRASS, saxaphone.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", saxaphone.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Gold", saxaphone.getColour());
    }

    @Test
    public void canMakeNoise(){
        assertEquals("The saxaphone is honking: Baker Street", saxaphone.makeNoise(" Baker Street"));
    }

    @Test
    public void hasStockPrice(){
        assertEquals(500.00, saxaphone.getStockPrice(),1);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(750.00, saxaphone.getRetailPrice(),1);
    }

    @Test
    public void hasMarkupValue(){
        assertEquals(250.00, saxaphone.calculateMarkup(),1);
    }

    @Test
    public void hasProductDescription(){
        assertEquals("Gerry Rafferty's Sax", saxaphone.getProductDescription());
    }

}

