package kyu8;

public class VolumeOfCuboid {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        System.out.println(getVolumeOfCuboid(1, 2, 2));
        System.out.println(getVolumeOfCuboid(6.3, 2, 5));
    }
}
