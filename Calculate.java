import java.lang.Math.*;
public class Calculate {
	public static void main(String [] args){
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int mult = first * second;
		int divid = first / second;
		int sum = first + second;
		System.out.println("Sum " + sum);
		System.out.println("mult " + mult);
		System.out.println("div " + divid);
		
	}
} 