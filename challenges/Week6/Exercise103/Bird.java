
public class Bird {
    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }

    public String getName() {
        return this.name;
    }

    public void observed() {
        this.observed++;
    }


    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observed + " obervations";
    }
}
