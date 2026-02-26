class MathStringPrograms {

    static void reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reverse: " + rev);
    }

    static void checkPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    static void checkArmstrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }

    static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial: " + fact);
    }

    public static void main(String[] args) {
        reverseString("Java");
        checkPalindrome("madam");
        fibonacciSeries(10);
        checkArmstrong(153);
        factorial(5);
    }
}
