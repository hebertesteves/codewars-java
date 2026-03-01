package kyu8;

public class Dinglemouse {
    public static final Dinglemouse INST = new Dinglemouse();

    private static int ONE_HUNDRED = 100;

    private final int value;

    private Dinglemouse() {
        this.value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
