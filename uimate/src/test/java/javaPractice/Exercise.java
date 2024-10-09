package javaPractice;
import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        System.out.println(a);
        a.remove("apple");
        
        System.out.println(a);

        if(a.contains("orange")) {
            System.out.println("Orange is present in list");
        }
        else {
            System.out.println("Orange is not present in list");
        }

        System.out.println(a.size());

        for(int i =0; i < a.size(); i++) {
            System.out.println("Index "+ i + " value: " + a.get(i));
        }

    }

}