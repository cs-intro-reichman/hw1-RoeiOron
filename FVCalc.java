public class FVCalc {
	public static void main(String[] args) {
		double currentValue = Double.parseDouble(args[0]);
		double percentageRate = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);
		double rate = percentageRate / 100.0;
		double base = 1.0 + rate;
		double futureValueDouble = currentValue * Math.pow(base, years);
		int futureValueInt = (int) futureValueDouble;
		System.out.println("After " + (int) years + " years, $" + (int) currentValue + " saved at " + percentageRate + "% will yield $" + futureValueInt);
	} 
}