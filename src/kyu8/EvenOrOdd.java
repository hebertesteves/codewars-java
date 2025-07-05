package kyu8;

public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(1));
        System.out.println(evenOrOdd(2));
        System.out.println(evenOrOdd(-1));
        System.out.println(evenOrOdd(-2));
        System.out.println(evenOrOdd(0));
    }
}
