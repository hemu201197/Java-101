package co.edureka.java.except;

public class Except2 {

	public static void main(String[] args) {
		String str = "625";
		System.out.println(str + 25); //62525
		
		int n = Integer.parseInt(str);
		System.out.println(n);
		System.out.println(n + 25);
		
		n = Integer.parseInt("12");
		System.out.println(n);
		
		n = Integer.parseInt("A"); //java.lang.NumberFormatException
	}

}
