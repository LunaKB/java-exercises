package exercises;

import java.util.Scanner;

public class OneOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output;

        System.out.print("Please enter your name and press the Enter key: ");
        output = input.nextLine();
        System.out.println("Hello " + output + "!");
    }
}
