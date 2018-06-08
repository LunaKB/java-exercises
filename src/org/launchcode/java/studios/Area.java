package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    static final double PI = 3.14;

    public static void main(String[] args){
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle; Press enter: ");
        radius = input.nextDouble();

        while (radius < 0) {
            System.out.println("Error: Invalid Input " + radius + ".");
            System.out.print("Enter the radius of the circle; Press enter: ");
            radius = input.nextDouble();
        }

        System.out.println("The area is " + CalculateArea(radius) + ".");

    }

    static public double CalculateArea(double r)
    {
        return PI * r * r;
    }
}
