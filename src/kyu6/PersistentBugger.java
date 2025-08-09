package kyu6;

public class PersistentBugger {
    public static int persistence(long n) {
        int cont = 0;

        if (n > 10) {
            String[] result = String.valueOf(n).split("");
            long product = 1;

            for (String num : result) {
                product *= Integer.parseInt(num);
            }
            cont++;

            while (product >= 10) {
                result = String.valueOf(product).split("");

                product = 1;
                for (String num : result) {
                    product *= Integer.parseInt(num);
                }

                cont++;
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(4));
        System.out.println(persistence(25));
        System.out.println(persistence(999));
    }
}
