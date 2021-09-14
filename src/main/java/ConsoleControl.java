import java.util.Scanner;

public class ConsoleControl {
    private Scanner scanner;
    String ingredient;
    double amount;
    int units;

    public ConsoleControl() {
        scanner = new Scanner(System.in);
    }
    public int printMainMenu() {
        int menuSelection;
        System.out.println("--- Welcome! Please Select an option ---");
        System.out.println("1: Convert cups, tbsp, or tsp to grams");
        System.out.println("2: Convert Grams to cups, tbsp, or tsp");
        System.out.println("3: Ounces to Liters");
        System.out.println("4: Liters to Ounces");
        System.out.println("0: Exit");
        System.out.print("Enter option here: ");

        if (scanner.hasNextLine()){
            menuSelection = scanner.nextInt();
        }else {
            menuSelection = 100;
        }
        return menuSelection;
    }

// CURRENTLY NOT BEING USED
    public void IngredientConverterMenuGrams() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the baking unit conversion, because grams are always best");
        System.out.print("Please enter in what you want to convert to grams: ");
        ingredient = userInput.nextLine();

        System.out.print("What is the amount to convert (a number): ");
        amount = userInput.nextDouble();

        System.out.println("Please select your measurement unit:");
        System.out.println("1: Cups");
        System.out.println("2: Tablespoons");
        System.out.println("3: Teaspoons");
        System.out.print("Enter option here: ");
        units = userInput.nextInt();

        int test = 0;

    }





    public void next() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }

    public void exit() {
        scanner.close();
        System.exit(0);
    }

    public String nextOrBack(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("1: Convert another ingredient");
        System.out.println("2: Back to main menu");
        System.out.print("Enter option here: ");
        String input = userInput.nextLine();

        if (input.equals("1")){
            return "1";
        }
        if (input.equals("2")) {
            return "2";
        }
        else {
            return "Not a valid option";
        }
    }

}
