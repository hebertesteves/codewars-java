package kyu8;

public class WellOfIdeas {
    public static String well(String[] x) {
        int contGoodIdeas = 0;

        for (String ideas : x) {
            if (ideas.equals("good")) contGoodIdeas++;
        }

        if (contGoodIdeas == 0){
            return "Fail!";
        } else if (contGoodIdeas <= 2) {
            return "Publish!";
        } else {
            return "I smell a series!";
        }
    }

    public static void main(String[] args) {
        System.out.println(well(new String[] {"bad", "bad", "bad"}));
        System.out.println(well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        System.out.println(well(new String[] {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}
