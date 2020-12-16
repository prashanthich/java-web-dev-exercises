package exercises.technology.main;

public class Programme {
    public static void main(String[] args){
        Computer computerObj = new Computer("Dell", "Abc", 16);
        System.out.println(computerObj.getBrand());
        Laptop laptopObj = new Laptop("Apple","Pro",8,3,false);
        System.out.println(laptopObj.getModel());
        SmartPhone smartPhoneObj = new SmartPhone("Samsung", "S9", 16, 0.2, true);
        System.out.println(smartPhoneObj.isPortable());
    }
}
