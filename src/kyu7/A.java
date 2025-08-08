package kyu7;

public class A {

    private static int cont = 0;
    private static int number = 1;

    public static int getNumber() {
        if (cont == 0) {
            cont++;
            return number;
        } else {
            cont++;
            number *= 2;
            return number;
        }
    }

    public static void main(String[] args) {
        System.out.println(A.getNumber());
        System.out.println(A.getNumber());
        System.out.println(A.getNumber());
    }
}