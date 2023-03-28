package secondTask;

public class Main {
    public static void main(String[] args) {
        Competition.start(new Participant[]{new Human("Dan"), new Robot("N14H1"), new Cat("Barsik")},
                new Obstacle[]{new Wall(1.5), new Racetrack(150)});
    }

}
