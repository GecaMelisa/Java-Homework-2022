public class Fraction {
	private int denominator;
	private int numerator;
 
	public Fraction(int initialNum, int initialDen) {
		this.denominator=initialDen;
		this.numerator=initialNum;
	}
 
	public void setDenom(int newDenom) {
		this.denominator=newDenom;
	}
	public void setNum(int newNum) {
		this.numerator=newNum;
	}
 
	public double returnFraction() {
		return this.numerator/this.denominator;
	}
 
	public void lowestTerm() {
		int gcd;
		int newNum, newDen;
		if(this.numerator<this.denominator) {
			gcd=this.numerator;
		} else {
			gcd=this.denominator;
		}
		newNum=this.numerator/gcd;
		newDen=this.denominator/gcd;
		System.out.println(newNum+"/"+newDen);
	}
}