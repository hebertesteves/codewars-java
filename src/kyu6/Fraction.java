package kyu6;

public class Fraction implements Comparable<Fraction>
{
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        long mdc = mdc(Math.abs(numerator), Math.abs(denominator));

        top = numerator / mdc;
        bottom = denominator / mdc;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    // Your work here!

    //Add two fractions
    public Fraction add(Fraction f2) {
        long sumTop = this.top * f2.bottom + f2.top * this.bottom;
        long sumBottom = this.bottom * f2.bottom;

        return new Fraction(sumTop, sumBottom);
    }

    private long mdc(long a, long b) {
        return (b == 0) ? a : mdc(b, a % b);
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(4, 5);
        System.out.println(fraction1.add(new Fraction(1, 8)));

        System.out.println(new Fraction(2, 5).add(new Fraction(2, 5)));
    }
}


