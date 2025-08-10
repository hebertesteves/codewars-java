package kyu8;

public class EnoughSpace {
    public static int enough(int cap, int on, int wait){
        int total = on + wait;
        return total <= cap ? 0 : total - cap;
    }

    public static void main(String[] args) {
        System.out.println(enough(10, 5, 5));
        System.out.println(enough(100, 60, 50));
        System.out.println(enough(20, 5, 5));

    }
}
