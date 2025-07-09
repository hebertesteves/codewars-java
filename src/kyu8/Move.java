package kyu8;

public class Move {
    public static int move(int position, int roll) {
        return position + 2 * roll;
    }

    public static void main(String[] args) {
        System.out.println(move(0, 4));
        System.out.println(move(3, 6));
        System.out.println(move(2, 5));
    }
}
