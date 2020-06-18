public enum SuitType {
    HEARTS("Red"),
    DIAMONDS("Red"),
    SPADES("Black"),
    CLUBS("Black");

    public final String color;

    SuitType(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

}
