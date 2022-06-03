package Devices;

public class Drivers {
    public static void main(String[] args) {
        Smartphone s = new Smartphone("Apple Iphone 11");
        Specs spek = new Specs("Apple A13 Bionic","12Mp Camera","Selfie",s);
        System.out.println("Smartphone: " +spek.getSmartphone().getSmartphoneNamee());
        System.out.println("Specs: " +spek.getSpecs1()+"\n\t "+spek.getSpecs2()+"\n\t "+spek.getSpecs3());
    }
}
