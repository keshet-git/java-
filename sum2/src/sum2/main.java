package sum2;

import java.util.InputMismatchException;
import java.util.Scanner;

	
public class main {

	public static void main(String[] args) {
		
		
		try {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a whole number to divde: ");
		int x = scanner.nextInt();
		
		System.out.println("Enter a whole number to divde by: ");
		int y = scanner.nextInt();
		
		int z = x/y;
		
		System.out.println("result" + z);
		
		// TODO Auto-generated method stub

	}
	catch(ArithmeticExeception e) {
		System.out.println("you can't divide by zero IDIDT!");
	}
	catch(InputMismatchExcption e) {
		System.out.println("PLESAE ENTER A NUMBER OMG!!!");	
	}
		catch(Exeception e) {
			System.out.println("somthing went wrong");
		}
			
	finally {
		Scanner.close();
	}
			

}
