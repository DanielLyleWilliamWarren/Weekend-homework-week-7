import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar(InstrumentType.STRING, "Wood", "Beige", 200.00, 300.00, "Gibson Les Paul");
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Beige", guitar.getColour());
    }

    @Test
    public void canMakeNoise(){
        assertEquals("The guitar is screeching: while my guitar gently weeps", guitar.makeNoise(" while my guitar gently weeps"));
    }

    @Test
    public void hasStockPrice(){
        assertEquals(200.00, guitar.getStockPrice(),1);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(300.00, guitar.getRetailPrice(),1);
    }

    @Test
    public void hasMarkupValue(){
        assertEquals(100.00, guitar.calculateMarkup(),1);
    }

    @Test
    public void hasProductDescription(){
        assertEquals("Gibson Les Paul", guitar.getProductDescription());
    }

}

