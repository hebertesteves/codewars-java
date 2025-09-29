package kyu7;

public class BrokenPhotocopier {
    public static String broken(final String x) {
        String[] result = x.split("");
        StringBuilder sb = new StringBuilder();

        for (String n : result) {
            if (n.equals("0")) sb.append("1");
            else if (n.equals("1")) sb.append("0");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(broken("0"));
        System.out.println(broken("01111111010010000001100110111"));
    }
}
