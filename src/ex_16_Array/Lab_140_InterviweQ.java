package ex_16_Array;

import java.util.Arrays;

public class Lab_140_InterviweQ {
    // Find Second Largest Number in an Array
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers); // 1,10,12,34

        System.out.println(numbers[numbers.length - 2]);
    }
}
