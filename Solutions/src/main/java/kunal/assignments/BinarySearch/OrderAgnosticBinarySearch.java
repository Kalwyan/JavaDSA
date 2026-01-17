package kunal.assignments.BinarySearch;

/**
 * Problem: Figure out the order and then find the number
 * Solution:
 * 1. Comparing the start and end value will let us know the order
 * 2. Based on the order tweak the logic
 */
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 88, 209, 555, 5321};
        //int[] numbers = {2443, 344, 296, 288, 209, 55};
        int target = 209;
        int index = orderAgnosticBS(target, numbers);
        System.out.println(index);
    }

    public static int orderAgnosticBS(int target, int[] numbers){
        int start = 0;
        int end = numbers.length-1;
        boolean isAsc = false;
        if(numbers[start] < numbers[end]){
            isAsc = true;
        }
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target == numbers[mid]){
                return mid;
            }
            if(isAsc){
                if(target < numbers[mid]){
                    end = mid-1;
                }else if(target > numbers[mid]){
                    start = mid+1;
                }
            }else{
                if(target > numbers[mid]){
                    end = mid-1;
                }else if(target < numbers[mid]){
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
