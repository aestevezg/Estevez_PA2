import java.util.Scanner;
public class BMICalc {

	
	public static void main(String[] args) {
		//init scanner
		Scanner scnr = new Scanner(System.in);
		
		//init variable
		double lbs;
		double in;
		double kg;
		double m;
		double BMI = 0;
		
		//ask user for option
		System.out.println("Please type 'a' for US Units (lbs, in) or 'b' for Metric Units (kg, m): ");
		
		//init switch and case option
		char units;
		units = scnr.next().charAt(0);
		
		switch(units) {
		case 'a': //Option a: US Units 
			//Scan for user Input
			System.out.println("Please enter your weight in pounds (lbs): ");
			lbs = scnr.nextDouble();
			System.out.println("PLease enter your height in inches (in): ");
			in = scnr.nextDouble();
			
			//Calc BMI
			BMI = (lbs * 703) / (Math.pow(in, 2));
			
			//Show BMI
			System.out.printf("\nYour BMI: %.2f \n", BMI);
			break;
			
		case 'b': //Option b: Metric Units
			//Scan for user Input
			System.out.println("Please enter your weight in kilograms (kg): ");
			kg = scnr.nextDouble();
			System.out.println("PLease enter your height in meters (m): ");
			m = scnr.nextDouble();
			
			//Calc BMI
			BMI = kg / (Math.pow(m, 2));
			
			//Show BMI
			System.out.printf("\nYour BMI: %.2f \n", BMI);
			break;
		
		default: //Error
			System.out.println("Error: Invalid input");
		}
		
		//Display ALL Categories
		System.out.println("\nBMI Categories:");
		System.out.println("\nUnderweight: BMI < 18.5");
		System.out.println("Normal Weight: BMI 18.5 - 24.9");
		System.out.println("Overweight: BMI 25.0 - 29.9");
		System.out.println("Obesity: BMI >= 30.0\n");
		
		//Display User Category
		if(BMI != 0 && BMI < 18.5) {
			System.out.println("You are Underweight (BMI: less than 18.5)");
		}
		else if (BMI >= 18.5 && BMI <= 24.9) {
			System.out.println("You are Normal Weight (BMI: 18.5 - 24.9)");
		}
		else if (BMI >= 25 && BMI <= 29.9) {
			System.out.println("You are Overweight (BMI: 25.0 - 29.9)");
		}
		else if (BMI >= 30) {
			System.out.println("You are Obese (BMI: greater than 30.0)");
		}
	}
	}
