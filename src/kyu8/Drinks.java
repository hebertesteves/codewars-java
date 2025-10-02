package kyu8;

public class Drinks {
    public static String peopleWithAgeDrink(int age){
        String result;
        if (age < 14) result = "drink toddy";
        else if (age < 18) result = "drink coke";
        else if (age < 21) result = "drink beer";
        else result = "drink whisky";
        return result;
    }
}
