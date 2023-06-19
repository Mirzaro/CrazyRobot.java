package robot;

public class CrazyRobot extends Robot {
    public CrazyRobot() {
        super();
    }

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    @Override
    public void boot() {

        String reversedName = new StringBuilder(getUnitName()).reverse().toString();
        setUnitName(reversedName);


        super.boot();


        System.out.println("My new name is: " + getUnitName());
    }
}