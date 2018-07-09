import Instruments.Guitar;
import Instruments.Instrument;

public class Customer {

    private String name;
    private double wallet;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void buyThing(Instrument guitar) {
        this.wallet -= guitar.getRetailPrice();
    }
}
