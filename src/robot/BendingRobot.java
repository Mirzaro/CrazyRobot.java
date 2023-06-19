package robot;

    public class BendingRobot {
        private double maxBendAngle;
        private String unitName;

        public BendingRobot(double maxBendAngle, String unitName) {
            this.maxBendAngle = maxBendAngle;
            this.unitName = unitName;
        }

        public void bend(double angle) {
            if (angle > maxBendAngle) {
                System.out.println("Bend is not possible. Maximum bend angle for " + unitName + " is " + maxBendAngle + " degrees.");
            } else {
                double requiredAngle = angle % 360;
                System.out.println("Bend was successful with the required angle of " + requiredAngle + " degrees for " + unitName + ".");
            }
        }
    }

