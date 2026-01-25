import java.util.Arrays;

public class QuestionOne {

    public static void reverse(double[] arr) {

        if (arr == null || arr.length <= 1) {
            return;
        }

        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            // Swap the values at start and end
            double temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        double[] values = {5.8, 2.6, 9.0, 3.4, 7.1};

        System.out.println("Original Array: " + Arrays.toString(values));
        reverse(values);
        System.out.println("Reversed Array: " + Arrays.toString(values));
    }
}