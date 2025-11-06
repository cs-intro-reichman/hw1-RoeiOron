public class Ascend {
	public static void main(String[] args) {
		int low = 0;
		int high = Integer.parseInt(args[0]);
		int a = (int)(Math.random()* (high - low + 1));
		int b = (int)(Math.random()* (high - low + 1));
		int c = (int)(Math.random()* (high - low + 1));
		int sum = a + b + c;
		System.out.print(a + " " + b + " " + c);
		int first = Math.min(a, Math.min(b, c));
		int third = Math.max(a, Math.max(b, c));
		int second = sum - first - third;
		System.out.println(first + " " + second + " " + third);
		} 
	}
