package kyu8;

public class WelcomeToTheCity {
    public static String sayHello(String [] name, String city, String state){
        return "Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";
    }

    public static void main(String[] args) {
        System.out.println(sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona"));
    }
}
