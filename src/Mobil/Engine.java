package Mobil;

public class Engine {
    private String enginetype;
    private String enginepower;
    private String enginename;

    public Engine(String enginetype, String enginename, String enginepower){
        this.enginetype = enginetype;
        this.enginename = enginename;
        this.enginepower = enginepower;

    }

    public String getType(){
        return enginetype;
    }

    public String getName(){
        return enginename;
    }

    public String getPower(){
        return enginepower;
    }
}
