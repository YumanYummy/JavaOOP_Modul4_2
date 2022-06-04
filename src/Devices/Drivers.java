package Devices;

public class Drivers {
    public static void main(String[] args) {
        Smartphone s = new Smartphone("Apple Iphone 11","Apple A13 Bionic Procesor");
        Specs spek = new Specs("Apple A13 Bionic","12Mp Camera","Selfie",s);
        System.out.println("Smartphone: " +spek.getSmartphone().getSmartphoneNamee());
        System.out.println("Specs 1 : " +spek.getSpecs1().getSpecss1());
        System.out.println("Specs 2 : " +spek.getSpecs2());
        System.out.println("Specs 3 : " +spek.getSpecs3());
    }
}
