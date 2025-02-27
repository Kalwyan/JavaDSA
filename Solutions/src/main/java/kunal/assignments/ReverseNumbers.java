package kunal.assignments;

import java.util.Arrays;

/**
 * Problem: Reverse given numbers
 * Examples:
 *  Example1:
 *      Input: 10,4,2,5
 *      Output: 5,2,4,10
 *  Example2:
 *      Input: 10,4,2,3,3,2,5
 *      Output: 5,2,3,3,2,4,10
 *
 * Solution: Loop and swap with the start and end index
 * 1. Have a separate method to swap two numbers based on index
 * 2. Loop that method passing a new start and end index everytime, until start < end
 * 3. Increment the start index
 * 4. Decrement the end index
 *
 */
public class ReverseNumbers {
    public static void main(String[] args) {
        int[] numbers = {10,4,2,3,3,2,5};
        System.out.println("Reversed numbers: "+reverseNumbers(numbers));
    }

    private static String reverseNumbers(int[] numbers) {
        int start = 0;
        int end = numbers.length-1;
        while (start < end){
            swap(numbers,start,end);
            start++;
            end--;
        }
        return Arrays.toString(numbers);
    }

    public static void swap(int[] numbers, int i, int j){
        int temp =numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }


}
