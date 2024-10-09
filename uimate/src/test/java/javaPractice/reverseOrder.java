package javaPractice;
public class reverseOrder {
    public static void main(String[] args) {

            int[] numbers = new int[]{1,2,3,4,5};
            System.out.println(numbers[0]);
            System.out.println(numbers[numbers.length-1]);
            
            for(int i =numbers.length-1; i>0; i--) {
                System.out.println(numbers[i]);
            } 
    }
    
}
