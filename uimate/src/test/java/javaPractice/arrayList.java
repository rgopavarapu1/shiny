package javaPractice;
import java.util.ArrayList;


public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> andy = new ArrayList<String>();
        andy.add("Nicole");
        andy.add("is");
        andy.add("on");
        andy.add("call");
        andy.add("today");
        System.out.println(andy);
        System.out.println("ArrayList size is " + andy.size());
        System.out.println(andy.get(2));
//      check if a string is present in Array list
        System.out.println(andy.contains("call"));

    }
    
}
