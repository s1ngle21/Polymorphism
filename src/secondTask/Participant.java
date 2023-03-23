package secondTask;

public abstract class Participant {

    private String name;
    private double maxRunDist;
    private double maxJumpDist;

    public Participant(String name, double maxRunDist, double maxJumpDist) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpDist = maxJumpDist;
    }

    public String getName() {
        return name;
    }

    public void run(double distance) {
        System.out.println(getName() + " is running");
        if (distance <= maxRunDist) {
            System.out.println("Member " + getName() + " passed distance " + distance + " meters.");
        } else {
            System.out.println("Member " + getName() + " did not passed distance " + distance + " meters. He run " + maxRunDist + " meters.");
        }
    }

    public void jump(double height) {
        System.out.println(getName() + " is jumping");
        if (height <= maxJumpDist) {
            System.out.println("Member " + getName() + " overcome wall with " + height + " meters.");
        } else {
            System.out.println("Member " + getName() + " did not overcome wall with " + height + " meters. He jumped " + maxJumpDist + " meters.");
        }
    }
}
