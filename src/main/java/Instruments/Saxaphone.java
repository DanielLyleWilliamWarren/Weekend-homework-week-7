package Instruments;

import Behaviours.IPlay;

public class Saxaphone extends Instrument implements IPlay{

    public Saxaphone(InstrumentType type, String material, String colour, double stockPrice, double retailPrice, String productDescription){
        super(type, colour, material, stockPrice, retailPrice, productDescription);
    }

    public String makeNoise(String noise){
        return "The saxaphone is honking:" + noise;
    }

}
