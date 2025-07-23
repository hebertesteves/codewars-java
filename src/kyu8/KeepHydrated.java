package kyu8;

public class KeepHydrated {
    public static int liters(double time)  {
        return (int) (time * 0.5);
    }

    public static void main(String[] args) {
        System.out.println(liters(2));
        System.out.println(liters(0.82));
        System.out.println(liters(12.83));
        System.out.println(liters(1802.44));
        System.out.println(liters(60));
        System.out.println(liters(865));
    }
}
