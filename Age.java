package Assigment3;
import java.util.*;

public class Age {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		if(age>=18 && age<=60) {
			System.out.println("Valid Age");
		}
		else {
			System.out.println("Invalid age");
		}

	}

}
