import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class KthSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(3);
        numbers.add(9);
        numbers.add(21);
        numbers.add(7);
        System.out.println("Original List: " + numbers);
        int k = 3;
        try {
            int result = findKthSmallest(numbers, k);
            System.out.println("The " + k + "rd smallest element is: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static int findKthSmallest(ArrayList<Integer> list, int k) throws Exception {

        if (k < 1 || k > list.size()) {
            throw new Exception("Invalid value for k");
        }
        Collections.sort(list);
        return list.get(k - 1);
    }
}