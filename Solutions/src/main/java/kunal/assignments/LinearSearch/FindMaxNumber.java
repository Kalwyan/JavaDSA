package kunal.assignments.LinearSearch;

/**
 * Problem: Find maximum number from the given list of numbers
 * Example:
 *      Input: 10,3,4,4,11,23,2,1,4
 *      Output: 23
 *
 * Solution:Starting from index 0 compare with the every element and update the maximum number field, return the
 * maximum available number at the end.
 *
 */
public class FindMaxNumber {
    public static void main(String[] args) {
        int[] numbers = {10,3,4,4,11,23,2,1,4};
        System.out.println("Max Number is: "+findMaxNum(numbers));
    }

    private static int findMaxNum(int[] numbers) {
        int maxNumber = numbers[0];
        for(int i=1; i<numbers.length ; i++){
            if(numbers[i] > maxNumber) maxNumber = numbers[i];
        }
        return maxNumber;
    }

}
