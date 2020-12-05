package practice;

public class HelloWorld {
    protected String message = "Hello!";
    private void greetings() {
        String message = "123";
        System.out.println(this.message);
    }
    public  void printMessage(){
        greetings();
    }
}

