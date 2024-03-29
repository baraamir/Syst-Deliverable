package ca.sheridancollege.project;

/**
 * This class is responsible for the values of the Uno cards
 *
 * @author Amir Barakat, December 18, 2021 
 */
public enum CardValue {

    ZERO(0, "Zero"),
    ONE(1, "One"),
    TWO(2, "Two"),
    THREE(3, "Three"),
    FOUR(4, "Four"),
    FIVE(5, "Five"),
    SIX(6, "Six"),
    SEVEN(7, "Seven"),
    EIGHT(8, "Eight"),
    NINE(9, "Nine"),
    SKIP(10, "Skip"),
    REVERSE(11, "Reverse"),
    DRAWTWO(12, "Draw two"),
    DRAWFOUR(13, "Draw four"),
    WILDCARD(14, "Wildcard"),;

    //private variables 
    private int index;
    private String name;

    //An argument constructor for the index and name.
    private CardValue(int index, String name) {

        this.index = index;
        this.name = name;

    }

    //getters and setters for the index and name.
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    /**
     * 
     * @return String name of the value
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
    

}
