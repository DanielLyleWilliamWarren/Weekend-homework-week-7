import Paraphernalia.BrassPolish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassPolishTest {

    BrassPolish polish;

    @Before
    public void setup(){
        polish = new BrassPolish(5.00, 7.50, "Makes Brass Shine");
    }

    @Test
    public void hasStockPrice(){
        assertEquals(5.00, polish.getStockPrice(),1);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(7.50, polish.getRetailPrice(), 1);
    }

    @Test
    public void hasProductDescription(){
        assertEquals("Makes Brass Shine", polish.getProductDescription());
    }
}
