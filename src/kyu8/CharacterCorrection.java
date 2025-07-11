package kyu8;

public class CharacterCorrection {
    public static String correct(String string) {
       return string.replace("1", "I").replace("0", "O").replace("5", "S");
    }

    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
        System.out.println(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
        System.out.println(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));
    }
}
