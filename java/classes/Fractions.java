class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(){
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int n, int d){
        numerator = n;
        if (d != 0)
            denominator = d;
        else
            denominator = 1;
        reduce();
    }

    public String toString(){
        return numerator + "/" + denominator + " (" + getReal() + ")";
    }

    public int getNumerator(){
        return numerator;
    }

    public void setNumerator(int value){
        numerator = value;
        reduce();
    }

    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int value){
        if(value != 0){
            denominator = value;
            reduce();
        }            
    }

    public void reduce(){
        int gcd = 1;
        int min = Math.min(Math.abs(numerator), Math.abs(denominator));

        for (int i = 2; i <= min; i++){
            if (numerator % i == 0 && denominator % i == 0)
                gcd = i;
        }

        numerator /= gcd;
        denominator /= gcd;

        if (numerator == 0){
            denominator = 1;
        }

    }

    private double getReal(){
        return (double)numerator / denominator;
    }

    public Fraction add(Fraction f){
        Fraction sum = new Fraction();

        sum.numerator = (numerator * f.denominator) + (f.numerator * denominator);
        sum.denominator = denominator * f.denominator;
        sum.reduce();

        return sum;
    }

    public Fraction sub(Fraction f){
        Fraction neg_f = new Fraction(f.numerator * -1, f.denominator);

        Fraction diff = this.add(neg_f);

        return diff;
    }

    public Fraction mul(Fraction f){
        Fraction prod = new Fraction();

        prod.numerator = numerator * f.numerator;
        prod.denominator = denominator * f.denominator;
        prod.reduce();

        return prod;
    }

    public Fraction div(Fraction f){
        Fraction f_reciprocal = new Fraction(f.denominator, f.numerator);

        Fraction quotient = this.mul(f_reciprocal);

        return quotient;

    }

}

class FractionFun{

    public static void main(String[] args){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(5, 8);
        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(1, 0);

        System.out.println("f1: "+ f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("f4: " + f4);

        f3.setNumerator(5);
        f3.setDenominator(8);
        f1 = f2.add(f3);
        f4.setDenominator(88);
        f2 = f1.sub(f1);
        f3 = f1.mul(f1);
        f4 = f4.div(f3);
    
        System.out.println();
        System.out.println("f1: "+ f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("f4: " + f4);
        
    }

}
