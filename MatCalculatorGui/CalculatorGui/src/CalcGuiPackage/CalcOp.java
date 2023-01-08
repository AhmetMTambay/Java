package CalcGuiPackage;


import java.math.BigInteger;

public class CalcOp {

	/* case 1 */
	public double addition(double number1, double number2) {
		double result = number1 + number2;
		return result;
	}

	/* case 2 */
	public double subtraction(double number1, double number2) {
		double result = number1 - number2;
		return result;
	}

	/* case 3 */
	public double multiplication(double number1, double number2) {
		double result = number1 * number2;
		return result;
	}

	/* case 4 */
	public double division(double number1, double number2) {
		double result = number1 / number2;
		return result;
	}

	/* case 5 */
	public double modulo(double number1, double number2) {
		double result = number1 % number2;
		return result;
	}

	/* case 6 */
	public double power(double number1, double number2) {
		double power = 1;
		for (double i = 1; i <= number2; i++) {
			power *= number1;
		}
		return power;
	}

	/* case 7 */
	public double radiuscalc(double number1) {
		double pi = 3.14;
		return number1 * pi * 2;
	}

	/* case 8 */
	
	
	public static BigInteger factorial(long n) {
	    BigInteger value=BigInteger.valueOf(n);
	    
	   
	    for(long i=n-1;i>=1;i--){
	    	
	        value=value.multiply(BigInteger.valueOf(i));
	    }
	    return value;
	}
	
	
	/* case 9 */
	// public double sqroot(double number) {
	// return Math.sqrt(number);
	// }

	/*
	 * public static int addition2(int... numbers) { int total = 0; for(int
	 * number:numbers) { total=total+number; } return total; }
	 */

}
