package kunal.assignments.LinearSearch;

/**
 * Problem: Find the count of numbers with even number of digits in a given array of numbers.
 * Solution: Iterate through each number and apply math functionality called log base 10 plus 1,
 * which will give the count of a number
 */
class FindTheCountOfNumbersWithEvenDigits{

    public static void main(String[] args){
        int[] numbers = {2, 23, 345, 43, 3434, 898122, 536};
        int count = 0;
        for(int number : numbers){
            if(isCountEven(number)){
                count++;
            }
        }
        System.out.println("Count of even numbers in the given array of numbers is: "+count);
    }

    private static boolean isCountEven(int number) {
        if (number < 0){
            number = number*-1;
        }
        return (int)(Math.log10(number)+1) % 2 == 0;
    }


}