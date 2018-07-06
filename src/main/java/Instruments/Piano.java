package Instruments;

import Behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    public Piano(InstrumentType type, String material, String colour, double stockPrice, double retailPrice, String productDescription){
        super(type, colour, material, stockPrice, retailPrice, productDescription);
    }

    public String makeNoise(String noise){
        return "The piano is chiming:" + noise;
    }
}
