package kyu8;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        StringBuilder sb = new StringBuilder();

        if (birth == yearTo) return "You were born this very year!";

        if (birth > yearTo) {
            sb.append("You will be born in ").append(birth - yearTo);
            if (birth - yearTo > 1) sb.append(" years.");
            else sb.append(" year.");
        } else {
            sb.append("You are ").append(yearTo - birth);
            if (yearTo - birth > 1) sb.append(" years old.");
            else sb.append(" year old.");
        }

        return sb.toString();
    }
}
