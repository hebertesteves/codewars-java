package kyu7;

public class SquareEveryDigit {
    public int squareDigits(int n) {
        String[] digits = String.valueOf(n).split("");
        StringBuilder sb = new StringBuilder();

        for (String digit : digits) {
            int num = Integer.parseInt(digit);
            sb.append(String.valueOf(num * num));
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(new SquareEveryDigit().squareDigits(9119));
        System.out.println(new SquareEveryDigit().squareDigits(0));
    }
}
