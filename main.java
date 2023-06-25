import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonsInTank;
        double fuelEfficiency;
        double gasPrice;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallonsInTank = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            }
        } while (true);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            }
        } while (true);

        do {
            System.out.print("enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                gasPrice = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            }

        } while (true);

        double costPer100Miles = (100 / fuelEfficiency) * gasPrice;
        double distanceWithGas = fuelEfficiency * gallonsInTank;

        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can travel with the gas in the tank: " + distanceWithGas + "miles");

    }
}
