package robot;

public class RobotMainApp {

 public static void main(String[] args) {



            LiftingRobot liftRobot = new LiftingRobot(20,"Jeff");
            BendingRobot bendRobot = new BendingRobot(280,"Jeffry");


            liftRobot.lift(5);


            liftRobot.lift(10);


            bendRobot.bend(90);


            bendRobot.bend(180);
        }
    }



