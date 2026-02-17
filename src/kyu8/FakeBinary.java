package kyu8;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String[] array = numberString.split("");
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) >= 5) {
                array[i] = "1";
            } else {
                array[i] = "0";
            }
        }
        return String.join("", array);
    }
}
