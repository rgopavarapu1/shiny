package javaPractice;
public class methodOverloading {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        int result = sum(9, 10, 3);
        int result2 = sum(4, 6);

        System.out.println(result);
        System.out.println(result2);
    }

}
