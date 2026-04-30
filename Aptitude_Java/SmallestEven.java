class SmallestEven{
    public static void main(String[] args){
        int[] arr = {9, 4, 7, 2, 11};

        int minEven = Integer.MAX_VALUE;

        for (int num : arr){
            if (num % 2 == 0 && num < minEven){
                minEven = num;
            }
        }

        if (minEven == Integer.MAX_VALUE)
            System.out.println("No even number found");
        else
            System.out.println("Smallest even: " + minEven);
    }
}