package exercises;

/*
Arrays: Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8. Then loop through the array and print out each value.
 */

public class TwoThree {

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 1, 2, 3, 5, 8};

        for(int a = 0; a < intArray.length; a++){
            System.out.println(intArray[a]);
        }
    }
}
