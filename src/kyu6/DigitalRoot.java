package kyu6;

public class DigitalRoot {
    public static int digital_root(int n) {
        while (n >= 10) {
            int d1 = n / 10;
            int d2 = n % 10;
            n = d1 + d2;
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(456));
    }
}
