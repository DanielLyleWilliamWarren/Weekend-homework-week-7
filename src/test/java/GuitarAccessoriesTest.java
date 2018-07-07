//import Paraphernalia.GuitarAccessories;
//import Paraphernalia.GuitarAccessoryType;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class GuitarAccessoriesTest {
//
//    GuitarAccessories strings;
//    GuitarAccessories picks;
//    GuitarAccessories stand;
//    GuitarAccessories tuner;
//
//    @Before
//    public void setup(){
//        strings = new GuitarAccessories(GuitarAccessoryType.STRINGS, 5.00, 10.00, "Guitar Strings");
//        picks = new GuitarAccessories(GuitarAccessoryType.PICKS, 1.00, 2.00, "Plectrums");
//        stand = new GuitarAccessories(GuitarAccessoryType.STAND, 20.00, 30.00, "Guitar Stand");
//        tuner = new GuitarAccessories(GuitarAccessoryType.TUNER, 10.00, 20.00, "Tuner");
//    }
//
//    @Test
//    public void hasStrings(){
//        assertEquals(GuitarAccessoryType.STRINGS, strings.getStrings());
//    }
//}