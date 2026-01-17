package kunal.assignments.BinarySearch;

/**
 * Problem: Find Ceiling index of a number from the given list of numbers
 * Solution:
 * 1. If the given number greater than the largest number, then we will return -1
 * 2. Otherwise at the loop breaking time start is going to be the ceiling
 */
public class CeilingOfGivenNumber {
    public static void main(String[] args) {
        int[] numbers = {2,5,9,29,45,56,78,900};
        int target = 800;
        int index = ceiling(target, numbers);
        System.out.println(index);
    }

    public static int ceiling(int target, int[] numbers){
        int start = 0;
        int end = numbers.length-1;

        if(target > numbers[numbers.length-1]){
            return -1;
        }
        while(start <= end){
            int mid = start+ (end-start)/2;
            if(target < numbers[mid]){
                end = mid-1;
            }else if(target > numbers[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }

        return start;
    }
}
