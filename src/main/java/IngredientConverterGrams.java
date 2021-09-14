import java.util.Locale;
import java.util.Scanner;

public class IngredientConverterGrams {
    ConsoleControl consoleControl = new ConsoleControl();
    double amount;
    String ingredient;
    int units;
    String ingredientInGrams;

    public void IngredientConverterMenuGrams() {
        Scanner userInput = new Scanner(System.in);

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
    }






    public String IngredientConverterGrams() {

        //convert all units to tablespoons
        if (units == 1) {
            amount *= 16;
        } else if (units == 3) {
            amount /= 3;
        }
        //if statements for different ingredients
        if (ingredient.toLowerCase().contains("flour")) {
            amount *= 7.822;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("baking powder")) {
            amount *= 13.3081;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("baking soda")) {
            amount *= 10.1881;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("brown sugar")) {
            amount *= 12.1695;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("sugar") || ingredient.toLowerCase().equals("granulated sugar")) {
            amount *= 12.554;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("powdered sugar")) {
            amount *= 7.556;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("honey")) {
            amount *= 20.9972;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().contains("syrup")) {
            amount *= 19.5185;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("stevia")) {
            amount *= 6.5505;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("butter")) {
            amount *= 14.1805;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("lard")) {
            amount *= 13.589;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("coconut oil")) {
            amount *= 13.667;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().contains("oil")) {
            amount *= 13.6038;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("milk")) {
            amount *= 15.3043;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("condensed milk")) {
            amount *= 19.1252;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("evaporated milk")) {
            amount *= 15.7494;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("whipped cream")) {
            amount *= 7.3342;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().contains("cream")) {
            amount *= 14.698;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("greek yogurt")) {
            amount *= 14.1953;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("almond") || ingredient.toLowerCase().equals("almonds")) {
            amount *= 6.8019;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().contains("cashew")) {
            amount *= 7.3934;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("peanuts") || ingredient.toLowerCase().equals("peanut")) {
            amount *= 9.4783;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("pecan") || ingredient.toLowerCase().equals("pecans")) {
            amount *= 6.8611;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("walnut") || ingredient.toLowerCase().contains("walnuts")) {
            amount *= 7.3125;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("6.654")) {
            amount *= 6.654;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("chocolate chips")) {
            amount *= 10.6465;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().contains("chocolate")) {
            amount *= 7.8074;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("cinnamon")) {
            amount *= 8.2806;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("cocoa powder") || ingredient.toLowerCase().contains("coco powder")) {
            amount *= 9.4783;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("yeast")) {
            amount *= 14.0474;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().contains("yogurt")) {
            amount *= 15.674;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().equals("peanut butter")) {
            amount *= 17.7441;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().contains("mayo")) {
            amount *= 13.456;
            ingredientInGrams = (amount + "g");
        } else if (ingredient.toLowerCase().contains("coffee")) {
            amount *= 5.0275;
            ingredientInGrams = (amount + "g");
        } else {
            ingredientInGrams = ("Currently do not have your boujee ingredient");
        }
        return ingredientInGrams;
    }
}
