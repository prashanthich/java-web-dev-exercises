package practice;

public class Student {

    private String name;
    private  int studentId;
    private int numberOfCredits;
    private double gpa;


    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);

    }

    /* getters and setters omitted */
  public String getName(){
      return this.name;
  }
  public int getStudentId(){
      return this.studentId;
  }
}