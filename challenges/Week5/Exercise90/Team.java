
import java.util.ArrayList;

public class Team {

    private static final int MAXPLAYERS = 16;
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = MAXPLAYERS;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        for(Player player: this.players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int goals = 0;

        for (Player player : this.players) {
            goals += player.goals();
        }

        return goals;
    }

}
