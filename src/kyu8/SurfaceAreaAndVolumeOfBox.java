package kyu8;

import java.util.Arrays;

public class SurfaceAreaAndVolumeOfBox {
    public static int[] getSize(int w,int h,int d) {
        int volume = w * h * d;
        int area = 2 * (w * h + w * d + h * d);
        return new int[] {area, volume};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSize(4, 2, 6)));
    }
}
