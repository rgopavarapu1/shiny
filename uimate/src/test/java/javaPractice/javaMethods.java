package javaPractice;
public class javaMethods {
    public static void main(String[] args) {
        // calling static method
        printHello();
        // calling object method
        javaMethods jd = new javaMethods();
        jd.printHello2();
    }

    public static void printHello() {
        System.out.println("Hello from PrintHello-Static");
    }

    public void printHello2() {
        System.out.println("Hello from PrintHello-object");
    }


    
}
