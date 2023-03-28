package secondTask;

public class Competition {
    public static void start(Participant[] participants, Obstacle[] obstacles) {
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }
    }

}
