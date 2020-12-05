package practice;

public class Main {
    public static void main(String[] args){
        HelloWorld greetingObj = new HelloWorld();
        greetingObj.message = "This is my first java oblect";
        greetingObj.printMessage();

        Student studentObj = new Student("Shanthi",123);
       // studentObj.setName("Santhosh " );
      //  String name = studentObj.getName();
        System.out.println(studentObj.getName()
                + " " + studentObj.getStudentId());
    }


}
