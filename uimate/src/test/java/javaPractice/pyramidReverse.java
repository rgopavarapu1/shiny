package javaPractice;
public class pyramidReverse {
    public static void main(String[] args) {
        int k = 1;
        int i =0;
        int j = 1;
        for(i = 1; i <=4; i++) {
            // System.out.println("Hey");
            for(j = 1; j <=i; j++) {
                System.out.print(k*3+"\t");
                k++;
                // System.out.print(j+"\t");
            }
            System.out.println("");
            // j=1;
        }

        
    }

}

/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
