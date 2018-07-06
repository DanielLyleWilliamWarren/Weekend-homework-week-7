package Instruments;

public enum InstrumentType {
    BRASS("Brass"),
    STRING("String"),
    KEYS("Keys");

    private final String type;

    InstrumentType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }


}
