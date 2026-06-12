public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 5, 7, 2, 12};
        
        // Initialize max with the first element
        int max = numbers[0]; 
        
        // Loop through the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger value is found
            }
        }
        
        System.out.println("Maximum value: " + max); // Output: 12
    }
}