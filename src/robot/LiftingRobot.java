package robot;

public class LiftingRobot {
    private double maxLiftHeight;
    private String unitName;

    public LiftingRobot(double maxLiftHeight, String unitName) {
        this.maxLiftHeight = maxLiftHeight;
        this.unitName = unitName;
    }

    public void lift(double height) {
        if (height > maxLiftHeight) {
            System.out.println("Bending is not possible.");
        } else {
            System.out.println("Lifting was successful with a height of " + height + " " + unitName + ".");





        }
    }
}