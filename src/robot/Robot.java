package robot;


public class Robot {
    private String unitName;

    public Robot() {
        this.unitName = "nameless Robot";
        boot();
    }

    public Robot(String unitName) {
        this.unitName = unitName;
        boot();
    }

    public void boot() {
        System.out.println("Booting " + unitName);
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }



}

