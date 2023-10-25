public class SpaceComplexityExample {
    public static void main(String[] args) {
        int[] numbers = new int[1000]; // Creating an array of 1000 integers
        int sum = 0; // An auxiliary variable to store the sum
        // Filling the array with values
        for (int i = 0; i < 1000; i++) {
            numbers[i] = i;
        }
        // Calculating the sum of the array elements
        for (int i = 0; i < 1000; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of elements: " + sum);
        // Calculate space complexity
        int arraySpace = numbers.length * 4; // Each integer uses 4 bytes of memory
        int sumSpace = 4; // An integer variable uses 4 bytes
        int totalSpace = arraySpace + sumSpace;
        System.out.println("Space complexity: " + totalSpace + " bytes");
    }
}





