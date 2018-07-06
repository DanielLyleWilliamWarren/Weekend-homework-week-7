import Instruments.Piano;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void setup(){
        piano = new Piano(InstrumentType.KEYS, "Oak and Ivory", "Hazelnut brown case, black and white keys", 1000.00, 1500.00, "Grand Piano");
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEYS, piano.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Oak and Ivory", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Hazelnut brown case, black and white keys", piano.getColour());
    }

    @Test
    public void canMakeNoise(){
        assertEquals("The piano is chiming: Moonlight Sonata in G", piano.makeNoise(" Moonlight Sonata in G"));
    }

    @Test
    public void hasStockPrice(){
        assertEquals(1000.00, piano.getStockPrice(),1);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(1500.00, piano.getRetailPrice(),1);
    }
    @Test
    public void hasMarkupValue(){
        assertEquals(500.00, piano.calculateMarkup(),1);
    }

    @Test
    public void hasProductDescription(){
        assertEquals("Grand Piano", piano.getProductDescription());
    }

}
