package kyu7;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
       String[] array = numbers.split(" ");
       int maior = Integer.parseInt(array[0]);
       int menor = Integer.parseInt(array[0]);
       for (int i = 1; i < array.length; i++) {
           int num = Integer.parseInt(array[i]);
           if (num > maior) {
               maior = num;
           }

           if (num < menor) {
               menor = num;
           }
       }

       return maior + " " + menor;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(highAndLow("1 2 3"));
    }
}
