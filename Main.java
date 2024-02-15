class Main {
  public static void main(String[] args) {

    // Init
    Fraction frac1 = new Fraction(2,4);
    Fraction frac2 = frac1;
    Fraction frac3 = new Fraction(frac1);
    
    // Test for Identical Objects
    if(frac1 <complete> frac2)
      System.out.println("frac1 and frac2 are identical objects");
    else
      System.out.println("frac1 and frac2 are NOT identical objects");
    
    if(frac2 <complete> frac3)
      System.out.println("frac2 and frac3 are identical objects");
    else
       System.out.println("frac2 and frac3 are NOT identical objects");

    // Test for Equal (value) Objects
    if(frac1 <complete> frac2)
      System.out.println("frac1 and frac2 have equal values");
    else
      System.out.println("frac1 and frac2 do NOT have equal values");
    
    if(frac2 <complete> frac3)
      System.out.println("frac2 and frac3 have equal values");
    else
      System.out.println("frac2 and frac3 do NOT have equal values");
  }
}