package exercises;

import java.util.Scanner;

public class OneTwo {

    public static void main(String[] args) {
        Float width, height;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the width and height of the rectangle and press the Enter key: ");
        width = input.nextFloat();
        height = input.nextFloat();
        System.out.println("The area of that rectangle is " + (width * height) + ".");
    }
}
