package Devices;

public class Specs {
    private String Specs1, Specs2, Specs3;
    private Smartphone Handphone;

    public Specs(String Specs1, String Specs2, String Specs3, Smartphone Handphone){
        this.Specs1 = Specs1;
        this.Specs2 = Specs2;
        this.Specs3 = Specs3;
        this.Handphone = Handphone;

    }

    public Smartphone getSmartphone(){
        return Handphone;
    }

    public Smartphone getSpecs1(){
        return Handphone;
    }
    public String getSpecs2(){
        return  Specs2;
    }
    public String getSpecs3(){
        return Specs3;
    }



}
