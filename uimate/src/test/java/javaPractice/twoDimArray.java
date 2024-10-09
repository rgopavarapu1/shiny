package javaPractice;
public class twoDimArray {
    public static void main(String[] args) {
        int numbers[][] = {{3,6,2}, {3,9,6}, {5,8,5}};

    // for(int i = 0;i<numbers[0].length;i++)
    // {

    //     for (int k = 0; k < numbers[1].length; k++) {

    //         System.out.println(numbers[i][k]);
    //     }
    // }

    for(int[] k: numbers) {
        for(int l: k) {
            System.out.print(l + " ");
        }
        System.out.println("");

    }
    }
    

}
