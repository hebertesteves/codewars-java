package kyu8;

public class SwitchItUp {
    public static String switchItUp(int number) {
        String result = switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Invalid number";
        };

        return result;
    }

    public static void main(String[] args) {
        System.out.println(switchItUp(5));
        System.out.println(switchItUp(4));
        System.out.println(switchItUp(1));
    }
}
