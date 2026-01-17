package kunal.assignments.BinarySearch;

/**
 * Problem: find index of an element from the given list of numbers
 * Solution: Using binary search for best time complexity called logn.
 * 1. Divide the given array by two parts based on the mid element
 * 2. Iterate this until start <= end
 * 3. If target < element look in left so make end = mid-1
 * 4. If target > element look in right so make start = mid+1
 * 5. Otherwise target will be equal to element return mid
 * 6. If the element not found returning -1
 */
public class FindAnElementBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 34, 56, 234, 730, 889, 900};
        int target = 731;
        int index = binarySearch(target, numbers);
        System.out.println(index);
    }

    public static int binarySearch(int target, int[] numbers){
        int start = 0;
        int end = numbers.length-1;
        int index = -1;
        while(start <= end){
            int mid = start + (end-start)/2;//To avoid the issue with integer max numbers other wise we can write (start+end)/2
            if(target < numbers[mid]){
                end = mid-1;
            }else if(target > numbers[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
