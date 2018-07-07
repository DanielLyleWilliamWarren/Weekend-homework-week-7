package Paraphernalia;

public enum GuitarAccessoryType {
    STRINGS("Strings"),
    PICKS("Picks"),
    TUNER("Tuner"),
    STAND("Stand");

    private final String type;

    GuitarAccessoryType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
