package kyu6;

public class MultiplicationTable {
    public static int [][] multiplicationTable(int n){
        int[][] table = new int[n][n];
        for (int i = 0; i < table.length; i++) {
            int value = i + 1;
            for (int j = 0; j < table.length; j++) {
                table[i][j] = value;
                value += i + 1;
            }
        }

        return table;
    }
}
