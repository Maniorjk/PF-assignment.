 import java.util.Scanner;
    public class Discountedprice {
        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Original Selling Price:");
            double originalPrice= sc.nextDouble();
            System.out.println("Enter Discount Percentage:");
            double discountPercentage = sc.nextDouble();
            double discountAmount = (originalPrice * discountPercentage) / 100;
            double discountedPrice = originalPrice - discountAmount;
            System.out.println("Discounted Price; " + discountedPrice);
            sc.close();
        }
    }
            