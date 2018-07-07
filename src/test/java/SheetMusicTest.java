import Paraphernalia.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setup() {
        sheetMusic = new SheetMusic(10.00, 20.00, "Sheet Music");
    }

    @Test
    public void hasStockPrice() {
        assertEquals(10.00, sheetMusic.getStockPrice(), 1);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(20.00, sheetMusic.getRetailPrice(), 1);
    }

    @Test
    public void hasProductDescription() {
        assertEquals("Sheet Music", sheetMusic.getProductDescription());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(10.00, sheetMusic.calculateMarkup(), 1);
    }
}
