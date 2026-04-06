public class GfG{
    public static boolean isPerfectSquare(long n) {
       
        if (Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        long x = 49;
        if (isPerfectSquare(x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}