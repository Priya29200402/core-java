class ArrayOperations {

    static void findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        System.out.println("Min: " + min);
    }

    static void findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        System.out.println("Max: " + max);
    }

    static void findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        double avg = (double) sum / arr.length;
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 40, 25};
        findMin(numbers);
        findMax(numbers);
        findAverage(numbers);
    }
}
