package exercises.technology.main;

import java.util.ArrayList;

public class SmartPhone extends Laptop {

    private ArrayList<String> notes;

    public SmartPhone(String brand, String model, int memory, double aWeight, boolean isMemoryExtendable) {
        super(brand, model, memory, aWeight, isMemoryExtendable);
    }
    public ArrayList<String> getNotes(){
        return this.notes;
    }
    public void setNotes(ArrayList<String> aNotes){
        this.notes = aNotes;
    }
    public void addNote(String note){
        if(this.notes == null){
            this.notes = new ArrayList<>();
        }
        this.notes.add(note);
    }
    @Override
    public boolean isPortable(){
        return getWeight() < 0.25;
    }
}
