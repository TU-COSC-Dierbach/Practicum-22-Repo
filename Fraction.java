public class Fraction {
  private int numerator;
  private int denominator;
 
  // constructor
  public Fraction(int numer, int denom) {
    numerator = numer;
    denominator = denom;
  }

  // copy constructor
  public Fraction(Fraction otherFrac) {
    numerator = otherFrac.getNumerator();
    denominator = otherFrac.getDenominator();
  }
  
  // getters
  public int getNumerator() {
    return numerator;
  }

  public void setNumerator(int n) {
    numerator = n;
  }

  public int getDenominator() {
    return denominator;
  }

  // toString method
  public String toString() {
    return numerator + "/" + denominator;
  }

  public <complete> equals() {
    < complete >
  }
}