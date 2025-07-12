package kyu8;

public class Cockroach {
    public static int cockroachSpeed(double x){
        return (int) Math.floor((x * 100000) / 3600);
    }

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
        System.out.println(cockroachSpeed(1.09));
        System.out.println(cockroachSpeed(0));
    }
}
