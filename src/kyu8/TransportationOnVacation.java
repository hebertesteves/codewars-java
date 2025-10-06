package kyu8;

public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        int discount;
        if (d >= 7) discount = 50;
        else if (d >= 3) discount = 20;
        else discount = 0;

        return d * 40 - discount;
    }

    public static void main(String[] args) {
        System.out.println(rentalCarCost(4));
    }
}
