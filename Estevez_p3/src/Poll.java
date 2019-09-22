import java.util.Scanner;
public class Poll {

	public static void main(String[] args) {
		//Init Scanner
		Scanner scnr = new Scanner(System.in);
		
		//Array w/topics
		String[] topics = {"Health", "Social Media", "Freedom", "Food", "Money"};
		
		//Rating Array
		int[][] rates = new int[topics.length][];
		
		//Init variables
		int i;
		int j;
		int count;
		int rate;
		
		//Init Array
		for(i = 0; i < rates.length; i++) {
			rates[i] = new int [10];
			for(j = 0; j < rates[i].length; j++) {
				rates[i][j] = 0;
			}
		}
		//Survey iterations
		System.out.print("How many people are taking survey? Please enter a number: ");
		count = scnr.nextInt();
		for(i = 0; i < count; i++){
		//Ratings
		System.out.println("\nRate Topics on a scale of Least Important (1) - Most Important (10)");
			for(j = 0; j < topics.length; j++) {
				System.out.println("Please rate " + topics[j] + " 1 - 10: ");
				rate = scnr.nextInt();
				rates[j][rate - 1]++;
			}
		}
		
		//Average Rating Array
		int avgRate[] = new int[topics.length];
		String maxTopic = "";
		String minTopic = "";
		int maxTotal = 0;
		int minTotal = 0;
		
		//Avg + Min & Max
		for(i = 0; i < rates.length - 1; i++);{
			avgRate[i] = 0;
			for(j = 0; j < rates[i].length; j++) {
				avgRate[i] = avgRate[i] + (rates[i][j] * (j + 1));
			}
			if(i == 0) {
				maxTotal = avgRate[i];
				minTotal = avgRate[i];
				maxTopic = topics[i];
				minTopic = topics[i];
			}
			else {
				if (avgRate[i] > maxTotal){
				maxTopic = topics[i];
				maxTotal = avgRate [i];
				}
			
			
				if (avgRate[i] < minTotal){
				minTopic = topics[i];
				minTotal = avgRate[i];
				}
			}
		avgRate[i] = avgRate[i] / count;
		}
	//Tabular display
	System.out.printf("\n%-20s", "");
	for(i = 0; i < 10; i++) {
		System.out.printf("%-10d", (i + 1));
	}
	System.out.printf("%20s", "Average Rate");
	System.out.println();
	
	for(i = 0; i < rates.length; i++) {
		System.out.printf("\n%-20s", topics[i]);
		for (j = 0; j < rates[i].length; j++) {
		System.out.printf("%-10d", rates[i][j]);
		}
		System.out.printf("%20d",  avgRate[i]);
	}
	
	//Display Max + Min
	System.out.println("\n\nTopic with most points: " + maxTopic + " with " + maxTotal + " points");
	System.out.println("\nTopic with least points: " + minTopic + " with " + minTotal + " points");
		}
		}
		

