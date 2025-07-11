package kyu8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormattingDecimalPlaces {
    public static double TwoDecimalPlaces(double number) {
        BigDecimal bd = BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(TwoDecimalPlaces(4.659725356));
        System.out.println(TwoDecimalPlaces(173735326));
    }
}
