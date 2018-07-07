import Paraphernalia.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings strings;

    @Before
    public void setup(){
        strings = new GuitarStrings(5.00, 10.00, "Guitar Strings");
    }

    @Test
    public void hasStockPrice(){
        assertEquals(5.00, strings.getStockPrice(),1);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(10.00, strings.getRetailPrice(), 1);
    }

    @Test
    public void hasProductDescription(){
        assertEquals("Guitar Strings", strings.getProductDescription());
    }
}
