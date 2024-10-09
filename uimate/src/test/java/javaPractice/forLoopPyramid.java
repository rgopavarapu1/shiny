package javaPractice;
public class forLoopPyramid {

    public static void main(String[] args) {
        int i = 1;

        for(int j = 0; j <= 5; j++) {
            // System.out.println("Hi");

            for(int k =1; k<5-j; k++) {
                System.out.print(i + "\t");
                i++;
            }
            System.out.println("");
        }
    }
}

/*
 *    1 2 3 4
 *    5 6 7
 *    8 9
 *    10
 */


 
