import java.util.Scanner;

public class Powercalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter voltage (Volts): ");
        double volts = sc.nextDouble();

        System.out.print("Enter current (Amperes): ");
        double amperes = sc.nextDouble();

        double watts = volts * amperes;

        System.out.println("Power Consumption = " + watts + " Watts");

        sc.close();
    }
}