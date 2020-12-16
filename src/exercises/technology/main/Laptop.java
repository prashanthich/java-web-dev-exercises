package exercises.technology.main;

import org.junit.Test;

public class Laptop extends Computer{
    private double weight;
    private boolean isMemoryExtendable;

    public Laptop(String brand,String model,int memory,double aWeight,boolean isMemoryExtendable){
        super(brand,model,memory);
        this.weight = aWeight;
        this.isMemoryExtendable = isMemoryExtendable;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean getIsMemoryExtendable(){
        return this.isMemoryExtendable;
    }

    @Override
    public void addMemory(int memory){
        if(isMemoryExtendable){
            super.addMemory(memory);
        }
    }
    public boolean isPortable(){
        return this.weight < 5;
    }

}
