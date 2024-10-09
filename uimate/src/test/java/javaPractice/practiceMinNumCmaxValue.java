package javaPractice;
public class practiceMinNumCmaxValue {

    public static void main(String[] args) {
        int[][] marks = {{25, 32, 41},{59, 12, 69},{75, 89, 3}};

        /* Get smallest value from array and fetch the highest number from that column
        Expected Answer: 41
        */
        int minValue = marks[0][0];
        int rowNumber=0;
        int maxScore = 0;

        // for(int[] k: marks) {

        //     for(int l: k) {
        //         if(minValue > l) {
        //             minValue = l;
        //             rowNumber = 
        //         }
        //     }
        // }

        for(int i =0; i <marks[0].length; i++) {

            for(int j =0; j<marks[i].length; j++) {
                if(minValue > marks[i][j]) {
                    minValue = marks[i][j];
                    System.out.println(j);
                    rowNumber = j;
                }
            }

        }

        for(int k= 0 ; k < 3; k++) {
            if(maxScore < marks[k][rowNumber]) {
                maxScore = marks[k][rowNumber];

            }
        }

        System.out.println("Min Value" +minValue);
        System.out.println("MaxScore" + maxScore);
        // System.out.println(column);
    }
    
}
