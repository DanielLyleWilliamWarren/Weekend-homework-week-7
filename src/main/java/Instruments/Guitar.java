package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay, ISell {

    public Guitar(InstrumentType type, String material, String colour, double stockPrice, double retailPrice, String productDescription){
        super(type, colour, material, stockPrice, retailPrice, productDescription);
    }

    public String makeNoise(String noise){
        return "The guitar is screeching:" + noise;
    }

}
