package find_two_elements_whose_sum_is_equal_to_x_question;

import java.util.HashMap;
import java.util.Scanner;

public class FindTwoElementsWhoseSumIsEqualToX {
    static void printPairs(int[] array, int sum) {
        HashMap<Integer, Integer> obj = new HashMap<>();
        int search;
        System.out.println("The pairs having sum " + sum + " are");
        for (int i = 0; i < array.length; i++) {
            search = sum - array[i];
            if (obj.containsValue(search)) {
                System.out.println(array[i] + " and " + search);
            } else {
                obj.put(i, array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.println("Enter the size of the array");
        size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum;
        System.out.println("Enter the sum you want to look for");
        sum = scanner.nextInt();

        printPairs(array, sum);
    }
}
