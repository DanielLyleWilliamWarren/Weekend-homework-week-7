import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Guitar guitar;

    @Before
    public void setup(){
        customer = new Customer("Dan", 500.00);
        guitar = new Guitar(InstrumentType.STRING, "Wood", "Beige", 200.00, 300.00, "Gibson Les Paul");
    }

    @Test
    public void hasName(){
        assertEquals("Dan", customer.getName());
    }

    @Test
    public void hasWallet(){
        assertEquals(500.00, customer.getWallet(),1);
    }

    @Test
    public void canBuyGuitar(){
        customer.buyThing(guitar);
        assertEquals(200.00, customer.getWallet(),1);
    }
}
