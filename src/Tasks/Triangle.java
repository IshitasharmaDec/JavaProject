package Tasks;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side a value");
        int a = sc.nextInt();
        System.out.println("Enter side b value");
        int b = sc.nextInt();
        System.out.println("Enter side c value");
        int c = sc.nextInt();

        if (a == b && b == c) {
            // Equilateral triangle: All sides are equal
            System.out.println("The triangle is Equilateral.");
        } else if (a == b || b == c || a == c) {
            // Isosceles triangle: Exactly two sides are equal
            System.out.println("The triangle is Isosceles.");
        } else {
            // Scalene triangle: No sides are equal
            System.out.println("The triangle is Scalene.");
        }
    }
}