package javaPractice;
import java.util.Arrays;
import java.util.List;

public class sampleFile {
    public static void main(String[] args) {
        // int array declaraiton with size
        int[] a = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;

// # Other way of declaraion
        int[] ab;
        ab = new int[]{2, 6, 4, 2};

// # String declaraion with size
        String[] names = new String[3];
        names[0] = "Ayan";
        names[1] = "Baniya";
        names[2] = "Choco";

// # Other way of declaration
        String[] school;
        school = new String[]{"Alpha", "Bonville", "Carrolton"};

// # Martrix array declaration
        String[][] courses;
        courses = new String[][]{{"Botany", "Zoology"}, {"Molecular", "Clinical"}, {"trignometry", "algebra"}};


        System.out.println("AB = " + ab[0]+ " " +ab[1]);
        System.out.println("First name is " + names[0]);
        System.out.println("Second school is " + school[1]);
        System.out.println("Third student's first course is " + courses[2][0]);


        List<String> namesArrayList = Arrays.asList(names);
        System.out.println(namesArrayList.contains("Baniya"));

        
    }


}
