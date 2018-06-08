package exercises;

import java.util.Scanner;

public class OneThree {

    public static void main(String[] args){
        Float miles, gallons;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the miles driven; Press the enter key: ");
        miles = input.nextFloat();

        System.out.print("Enter the gallons of gas used; Press the enter key: ");
        gallons = input.nextFloat();

        System.out.println("The miles per gallon is " + (miles/gallons) + ".");
    }
}
