import java.util.Scanner;

public class OuncesToLiters {
    double amount;
    String unit;
    String inLiters;

    public void ouncesToLitersMenu() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is the amount of ounces to convert? (a number): ");
        amount = userInput.nextDouble();
        System.out.print("Do you want to convert to liters or milliliters? (l or ml): ");
        unit = userInput.nextLine();
    }

    public String ouncesToLiters() {
        if (unit.equalsIgnoreCase("l") || unit.equalsIgnoreCase("liters")) {
            return inLiters = (amount /= 33.814) + "l";
        }
        else if (unit.equalsIgnoreCase("ml") || unit.equalsIgnoreCase("milliliters")){
            return inLiters = (amount *= 29.574) + "ml";
        }
        else {
            return inLiters = "invalid request, please try again.";
        }



    }
}
