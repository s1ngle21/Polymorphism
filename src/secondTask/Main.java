package secondTask;

public class Main {
    public static void main(String[] args) {
        Member[] members = {new Human("Dan"), new Robot("N14H1"), new Cat("Barsik")};
        Obstacle[] obstacles = {new Racetrack(150), new Wall(1.5)};

        for (Member member : members) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(member);
            }
        }

    }

}
