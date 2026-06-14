import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Available Currencies:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.println("4. GBP");

        System.out.print("Choose Base Currency (1-4): ");
        int base = sc.nextInt();

        System.out.print("Choose Target Currency (1-4): ");
        int target = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double rate = 0;

        if (base == 1 && target == 2)
            rate = 0.012;
        else if (base == 2 && target == 1)
            rate = 83.50;
        else if (base == 1 && target == 3)
            rate = 0.011;
        else if (base == 3 && target == 1)
            rate = 95.00;
        else if (base == 1 && target == 4)
            rate = 0.0095;
        else if (base == 4 && target == 1)
            rate = 105.00;
        else if (base == target)
            rate = 1;

        if (rate == 0) {
            System.out.println("Conversion Not Supported");
        } else {
            double convertedAmount = amount * rate;
            System.out.println("Converted Amount: " + convertedAmount);
        }

        sc.close();
    }
}