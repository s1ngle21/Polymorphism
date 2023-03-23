package secondTask;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Human("Dan"), new Robot("N14H1"), new Cat("Barsik")};
        Obstacle[] obstacles = {new Racetrack(150), new Wall(1.5)};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }

    }

}
