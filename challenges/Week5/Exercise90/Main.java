
public class Main {

    public static void main(String[] args) {

        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        Player mikael = new Player("Mikael", 1);

        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(mikael);

        System.out.println("Total goals: " + barcelona.goals());
    }

}
