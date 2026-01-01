package Assigment3;
import java.util.*;

public class Positive_negative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n==0) {
			System.out.println("Zero");
		}
		else if(n<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Positive");
		}

	}

}
