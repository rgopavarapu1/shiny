package javaPractice;
public class loops {

    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5,6,7,8,9,10, 23, 32, 252,414};

        for(int a :numbers) {
            if(a % 2 == 0) {
                System.out.println(a + " is even");
            }
            else {
                System.out.println(a + " is not even");
            }
        }
    }
}
