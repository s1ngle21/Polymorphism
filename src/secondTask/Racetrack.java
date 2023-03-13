package secondTask;

public class Racetrack extends Obstacle {
    private double length;

    public Racetrack(double lenght) {
        this.length = lenght;
    }

    @Override
    public void overcome(Member member) {
        member.run(length);
    }
}
