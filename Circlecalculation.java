import java.util.Scanner;

public class Circlecalculation {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = cc.nextDouble();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);

        cc.close();
    }
}