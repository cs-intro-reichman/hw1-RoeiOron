public class Bill3 { 
	public static void main(String[] args) {
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double sum = Double.parseDouble(args[3]);
		double split1 = sum / 3;
		double split2 = Math.ceil(split1);
		System.out.print("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + split2 + " Shekels each.");	
	}
}
