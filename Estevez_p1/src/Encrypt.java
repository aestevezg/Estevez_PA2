import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		//Scanner
		Scanner scnr = new Scanner(System.in);
		
		//init int
		int a;
		int b;
		int c;
		int d;
		
		//ask user for 4 integers
		System.out.println("Enter 4 integers: ");
		
		//scan in variables
		a = scnr.nextInt();
		b = scnr.nextInt();
		c = scnr.nextInt();
		d = scnr.nextInt();
		
		//print original
		System.out.println("Orginal integer: " + a + "" + b + "" + c + "" + d);
		
		// add 7 then / by 10
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		
		//print and encrypt
		System.out.println("Encrypted integer is: " + c + "" + d + "" + a + "" + b);
		

	}

}
