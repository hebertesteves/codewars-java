package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder binaryString = new StringBuilder();
        for (int num : binary) {
            binaryString.append(Integer.toBinaryString(num));
        }

        return Integer.parseInt(binaryString.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
    }
}
