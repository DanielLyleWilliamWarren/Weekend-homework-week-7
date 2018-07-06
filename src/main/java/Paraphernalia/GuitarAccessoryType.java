package Paraphernalia;

public enum GuitarAccessoryType {
    private final String type;

    InstrumentType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
