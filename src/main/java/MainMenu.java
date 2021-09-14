import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        int menuSelection = 100;
        int keepGoing = -1;

        ConsoleControl consoleControl = new ConsoleControl();
        IngredientConverterGrams ingredientConverterGrams = new IngredientConverterGrams();
        IngredientConverterImperial ingredientConverterImperial = new IngredientConverterImperial();
        LitersToOunces litersToOunces = new LitersToOunces();
        OuncesToLiters ouncesToLiters = new OuncesToLiters();

        while (menuSelection != 0){
            menuSelection = consoleControl.printMainMenu();
            if (menuSelection == 1){
                ingredientConverterGrams.IngredientConverterMenuGrams();
                ingredientConverterGrams.IngredientConverterGrams();
                System.out.println(ingredientConverterGrams.ingredientInGrams);

            }

            else if (menuSelection == 2) {
                ingredientConverterImperial.IngredientConverterMenuImperial();
                ingredientConverterImperial.IngredientConverterImperial();
                System.out.println(ingredientConverterImperial.strIngredientInImperial);
            }
            else if (menuSelection == 3) {
                litersToOunces.litersToOuncesMenu();
                litersToOunces.litersToOunces();
                System.out.println(litersToOunces.inOunces);
            }
            else if (menuSelection == 4) {
                ouncesToLiters.ouncesToLitersMenu();
                ouncesToLiters.ouncesToLiters();
                System.out.println(ouncesToLiters.inLiters);
            }

            else if (menuSelection == 0){
                consoleControl.exit();
            }else {
                System.out.println("Invalid Selection");
            }

//            if (menuSelection == 1) {
//                menuSelection = Integer.parseInt(consoleControl.nextOrBack());
//            }
            if (keepGoing != 0){
                consoleControl.next();
            }


        }

    }

}
