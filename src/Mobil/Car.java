package Mobil;

public class Car {
    private String Color;
    private Engine engine;

    public Car(String Color, Engine engine){
        this.Color = Color;
        this.engine = engine;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public String getColor(){
        return Color;
    }

    public Engine getEngine(){
        return engine;
    }
}
