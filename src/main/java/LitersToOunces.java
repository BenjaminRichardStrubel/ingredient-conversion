import java.util.Scanner;

public class LitersToOunces {
    double amount;
    String unit;
    String inOunces;

    public void litersToOuncesMenu() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is the amount to convert? (a number): ");
        amount = userInput.nextDouble();
        System.out.print("Liters or milliliters? (l or ml): ");
        unit = userInput.nextLine();
    }

    public String litersToOunces() {
        if (unit.equalsIgnoreCase("l") || unit.equalsIgnoreCase("liters")) {
            return inOunces = (amount *= 33.814) + "oz";
        }
        else if (unit.equalsIgnoreCase("ml") || unit.equalsIgnoreCase("milliliters")){
            return inOunces = (amount /= 29.574) + "oz";
        }
        else {
            return inOunces = "invalid request, please try again.";
        }



    }
}
