package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double userRadius;
        java.util.Scanner in;

        do {
            in = new Scanner(System.in);
            System.out.println("Enter the radius of your circle: ");
            userRadius = in.nextDouble();
            if (userRadius <= 0) {
                System.out.println("The radius of a circle must be positive!");
            }
        } while (userRadius <= 0);
        if (userRadius > 0) {
            System.out.println(area(userRadius));
        }
    }

    public static double area(double userRadius) {
        double circleArea;
        circleArea = 3.14 * userRadius * userRadius;
        return (circleArea);
    }
}
