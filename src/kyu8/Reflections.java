package kyu8;

public class Reflections {
    public static int[] reflectPoint(int[] p, int[] q) {
        int x = (2 * q[0] - p[0]);
        int y = (2 * q[1] - p[1]);
        return new int[]{x, y};
    }
}
