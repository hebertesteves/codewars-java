package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOdd {
    public static int findIt(int[] a) {
        List<Integer> numeros = Arrays.stream(a).boxed().distinct().toList();
        List<Integer> contadores = new ArrayList<>();

        numeros.forEach(num -> contadores.add((int) Arrays.stream(a).filter(n -> n == num).count()));

        int maior = 0;
        for (int i = 0; i < contadores.size(); i++) {
            if (contadores.get(i) > maior && contadores.get(i) % 2 != 0) maior = numeros.get(i);
        }

        return maior;
    }
}
