public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 7, 11};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the array elements is: " + sum);
    }
}