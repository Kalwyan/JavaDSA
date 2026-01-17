package kunal.assignments;

/**
 * Problem: Find floor index from the given list of numbers
 * Solution:
 * 1. If the given number is smaller than the smallest number of the list then return -1
 * 2. Else the end value at the loop break time will be the floor.
 */
public class FloorOfGivenNumber {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 9, 20, 204, 265};
        int target = 25;
        int index = floor(target, numbers);
        System.out.println(index);
    }

    public static int floor(int target, int[] numbers){
        int start = 0;
        int end = numbers.length-1;
        if(target < numbers[0]){
            return -1;
        }
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target < numbers[mid]){
                end = mid-1;
            }else if (target > numbers[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
