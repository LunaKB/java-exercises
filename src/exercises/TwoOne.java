package exercises;

/*
ArrayList: Write a static method to find the sum of all the even numbers in a list. Within main, create a list with at least 10 integers and call your method on the list.
 */

import java.util.ArrayList;

public class TwoOne {

    public  static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(34);
        numList.add(38);
        numList.add(24);
        numList.add(89);
        numList.add(52);
        numList.add(67);
        numList.add(2223);
        numList.add(5);
        numList.add(734445);
        numList.add(3);

        System.out.println("The sum of the even numbers in the list is " + SumEvens(numList) + ".");
    }

    static int SumEvens(ArrayList<Integer> ints){
        int sum = 0;

        for(int a = 0; a < ints.size(); a++)
        {
            if(ints.get(a) % 2 == 0)
                sum += ints.get(a);
        }

        return sum;
    }
}
