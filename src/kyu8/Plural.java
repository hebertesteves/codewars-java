package kyu8;

public class Plural {
    public static boolean isPlural(float f){
        return f != 1 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPlural(0f));
        System.out.println(isPlural(0.5f));
        System.out.println(isPlural(1f));
        System.out.println(isPlural(100f));
    }
}
