 import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double pi=3.14F;
        System.out.println("Enter the radius of the circle");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double AreaC = pi * radius * radius;
        System.out.println(AreaC);
        double perimeter = 2*pi*radius;
        System.out.println(perimeter);
    }
}
