import java.util.ArrayList;

public class BirdWatcher {
    private Bird bird;
    private ArrayList<Bird> birds;

    public BirdWatcher() {
        birds = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        bird = new Bird(name, latinName);
        this.birds.add(bird);
    }


    public void observe(String name) {
        for(Bird bird : birds) {
            if(name.equals(bird.getName())){
                bird.observed();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void showBird(String name) {
        for(Bird bird : this.birds) {
            if(name.equals(bird.getName())) {
                System.out.println(bird);
            }
        }
    }

    public void showAllBird() {
        for(Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

}
