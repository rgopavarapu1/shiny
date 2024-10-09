package javaPractice;
public class lowestNumber {
    public static void main(String[] args) {
        int numbers[][] = {{3,6,2}, {3,9,6}, {5,1,5}};
        int lowest= numbers[0][0];
        int currentNumber;
        for(int[] i:numbers) {
            for(int j : i) {
                // currentNumber = j;
                if(j < lowest) {
                    lowest = j;
                }
                System.out.println(lowest);

            }
        }
        

        // int a[] = {6, 5, 10, 43, 65, 76, 856, 2, 23};
        // // int lowest;

        // for(int i =0; i < a.length; i++) {

        // }
    }

}


// Print lowest number

// 6, 5, 10, 43, 65, 76, 856, 2, 23



