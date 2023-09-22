public class Method {
    // instance variables
    private String cup;
    private int caffine;
    /**
     * @param cup
     * @param caffine
     */
    public Person(String cup, int caffine) {
        this.cup = cup;
        this.caffine = caffine;
    }
    @Override
    public String toString() {
        return "cup : " + cup + "\ncaffine: " + caffine ;
    }
}