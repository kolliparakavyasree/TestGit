package factory;

public class CalculatorFactory {
	
	public static Calculator getCalc(String cal) {
		if(cal.equals("CalculatorA")) {
			return new CalculatorA();
		}else {
			return new CalculatorB();
		}
	}
	
	public static void main(String args[]) {
		Calculator calc = CalculatorFactory.getCalc(args[0]);
		int result = calc.calculate(8,9);
		System.out.println(result);
	}

}
