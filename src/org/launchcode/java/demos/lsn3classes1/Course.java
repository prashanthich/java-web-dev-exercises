package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String name;
    private int maxStudents;
    private ArrayList<Student> students;
    private int durationInWeeks;
    private ArrayList<String> taNames;

    public String getName(){
        return name;
    }
    public void setName(String aName){
        this.name = aName;
    }
    public int getMaxStudents(){
        return maxStudents;
    }
    public void setMaxStudents(int aMaxStudents){
        this.maxStudents = aMaxStudents;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void setStudents(ArrayList<Student> aStudents){
        this.students = aStudents;
    }
    public int getDurationInWeeks(){
        return durationInWeeks;
    }
    public void setDurationInWeeks(int aDurationInWeeks){
        this.durationInWeeks = aDurationInWeeks;
    }
    public ArrayList<String> getTaNames(){
        return taNames;
    }
    public void setTaNames(ArrayList<String> aTaNames){
        this.taNames = aTaNames;
    }
}
