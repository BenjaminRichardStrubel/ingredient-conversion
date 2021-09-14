import java.util.Scanner;

public class IngredientConverterImperial {
    double amount;
    String ingredient;
    int units;
    double ingredientInImperial;
    String strIngredientInImperial;

    public void IngredientConverterMenuImperial() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter in what you want to convert to US measurements: ");
        ingredient = userInput.nextLine();

        System.out.print("What is the amount to convert in grams (a number): ");
        amount = userInput.nextDouble();

        System.out.println("Please select your measurement unit to be converted to:");
        System.out.println("1: Cups");
        System.out.println("2: Tablespoons");
        System.out.println("3: Teaspoons");
        System.out.print("Enter option here: ");
        units = userInput.nextInt();

    }

    public String IngredientConverterImperial() {



    //if statements for different ingredients turning them into tablespoons
        if (ingredient.toLowerCase().contains("flour")) {
            ingredientInImperial = amount /= 7.822;

    } else if (ingredient.toLowerCase().equals("baking powder")) {
            ingredientInImperial = amount /= 13.3081;

    } else if (ingredient.toLowerCase().equals("baking soda")) {
            ingredientInImperial = amount /= 10.1881;

    } else if (ingredient.toLowerCase().equals("brown sugar")) {
            ingredientInImperial = amount /= 12.1695;

    } else if (ingredient.toLowerCase().equals("sugar") || ingredient.toLowerCase().equals("granulated sugar")) {
            ingredientInImperial = amount /= 12.554;

    } else if (ingredient.toLowerCase().equals("powdered sugar")) {
            ingredientInImperial = amount /= 7.556;

    } else if (ingredient.toLowerCase().equals("honey")) {
            ingredientInImperial = amount /= 20.9972;

    } else if (ingredient.toLowerCase().contains("syrup")) {
            ingredientInImperial = amount /= 19.5185;

    } else if (ingredient.toLowerCase().equals("stevia")) {
            ingredientInImperial = amount /= 6.5505;

    } else if (ingredient.toLowerCase().equals("butter")) {
            ingredientInImperial = amount /= 14.1805;

    } else if (ingredient.toLowerCase().equals("lard")) {
            ingredientInImperial = amount /= 13.589;

    } else if (ingredient.toLowerCase().equals("coconut oil")) {
            ingredientInImperial = amount /= 13.667;

    } else if (ingredient.toLowerCase().contains("oil")) {
            ingredientInImperial = amount /= 13.6038;

    } else if (ingredient.toLowerCase().equals("milk")) {
            ingredientInImperial = amount /= 15.3043;

    } else if (ingredient.toLowerCase().equals("condensed milk")) {
            ingredientInImperial = amount /= 19.1252;

    } else if (ingredient.toLowerCase().equals("evaporated milk")) {
            ingredientInImperial = amount /= 15.7494;

    } else if (ingredient.toLowerCase().equals("whipped cream")) {
            ingredientInImperial = amount /= 7.3342;

    } else if (ingredient.toLowerCase().contains("cream")) {
            ingredientInImperial = amount /= 14.698;

    } else if (ingredient.toLowerCase().equals("greek yogurt")) {
            ingredientInImperial = amount /= 14.1953;

    } else if (ingredient.toLowerCase().equals("almond") || ingredient.toLowerCase().equals("almonds")) {
            ingredientInImperial = amount /= 6.8019;

    } else if (ingredient.toLowerCase().contains("cashew")) {
            ingredientInImperial = amount /= 7.3934;

    } else if (ingredient.toLowerCase().equals("peanuts") || ingredient.toLowerCase().equals("peanut")) {
            ingredientInImperial = amount /= 9.4783;

    } else if (ingredient.toLowerCase().equals("pecan") || ingredient.toLowerCase().equals("pecans")) {
            ingredientInImperial = amount /= 6.8611;

    } else if (ingredient.toLowerCase().equals("walnut") || ingredient.toLowerCase().contains("walnuts")) {
            ingredientInImperial = amount /= 7.3125;

    } else if (ingredient.toLowerCase().equals("6.654")) {
            ingredientInImperial = amount /= 6.654;

    } else if (ingredient.toLowerCase().equals("chocolate chips")) {
            ingredientInImperial = amount /= 10.6465;

    } else if (ingredient.toLowerCase().contains("chocolate")) {
            ingredientInImperial = amount /= 7.8074;

    } else if (ingredient.toLowerCase().equals("cinnamon")) {
            ingredientInImperial = amount /= 8.2806;

    } else if (ingredient.toLowerCase().equals("cocoa powder") || ingredient.toLowerCase().contains("coco powder")) {
            ingredientInImperial = amount /= 9.4783;

    } else if (ingredient.toLowerCase().equals("yeast")) {
            ingredientInImperial = amount /= 14.0474;

    } else if (ingredient.toLowerCase().contains("yogurt")) {
            ingredientInImperial = amount /= 15.674;

    } else if (ingredient.toLowerCase().equals("peanut butter")) {
            ingredientInImperial = amount /= 17.7441;

    } else if (ingredient.toLowerCase().contains("mayo")) {
            ingredientInImperial = amount /= 13.456;

    } else if (ingredient.toLowerCase().contains("coffee")) {
            ingredientInImperial = amount /= 5.0275;

    } else {
        return strIngredientInImperial = "Currently do not have your ingredient";
    }

        if(units == 1) {
            return strIngredientInImperial = (ingredientInImperial /= 16) + " Cups";
        }
        else if (units == 2) {
            return strIngredientInImperial = (ingredientInImperial + " Tablespoons");
        }
        else if (units == 3) {
            return strIngredientInImperial = (ingredientInImperial *= 3) + " teaspoons";
        }
        else {
            return strIngredientInImperial = "invalid unit input";
        }
    }
}
