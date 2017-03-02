
public class Reformatory {

    private int weightMeasured;

    public Reformatory() {
        this.weightMeasured = 0;
    }

    public int weight(Person person) {
        this.weightMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int weight = person.getWeight();
        person.setWeight(weight++);
    }

    public int totalWeightsMeasured() {
        return weightMeasured;
    }

}
