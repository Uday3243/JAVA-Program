//9. Find the sum and average of elements in an array
public class ArraySumAverage {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double avg = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}

