import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdWatcher birdWatcher = new BirdWatcher();
        String command;

        while(true) {
            System.out.print("? ");
            command = reader.nextLine().trim();

            if (command.equals("Add")) {
                addBird(reader, birdWatcher);
            }else if (command.equals("Observation")) {
                observeBird(reader, birdWatcher);
            }else if (command.equals("Statistics")) {
                birdWatcher.showAllBird();
            }else if (command.equals("Show")) {
                showBird(reader, birdWatcher);
            }else if (command.equals("Quit")){
                break;
            }else {
                System.out.println("Unknown command");
            }

        }
    }

    public static void addBird(Scanner reader, BirdWatcher birdWatcher) {
        String name;
        String latinName;

        System.out.print("Name: ");
        name = reader.nextLine();

        System.out.print("Latin Name: ");
        latinName = reader.nextLine();

        birdWatcher.addBird(name, latinName);
    }

    public static void observeBird(Scanner reader, BirdWatcher birdWatcher) {
        String bird;

        System.out.print("What was observed:? ");
        bird = reader.nextLine();

        birdWatcher.observe(bird);
    }

    public static void showBird(Scanner reader, BirdWatcher birdWatcher) {
        String bird;

        System.out.print("What? ");
        bird = reader.nextLine();

        birdWatcher.showBird(bird);
    }
}
