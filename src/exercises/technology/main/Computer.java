package exercises.technology.main;

public class Computer {
    private String model;
    private String brand;
    private int memory;
    private String operatingSystem;

    public Computer(String aBrand, String aModel,int aMemory){
        brand = aBrand;
        model = aModel;
        memory = aMemory;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String aModel){
        this.model = aModel;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String aBrand){
        this.brand = aBrand;
    }
    public int getMemory(){
        return memory;
    }
    public void setMemory(int aMemory){
        this.memory = aMemory;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public void setOperatingSystem(String aOperatingSystem){
        this.operatingSystem = aOperatingSystem;
    }
    public void addMemory(int memory){
        this.memory += memory;
    }

}
