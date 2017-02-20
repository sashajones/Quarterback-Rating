/* Sasha Jones
 * CISC 181 - Prof. Bert Gibbons
 * Quiz 1: Quarterback passer Rating
 * February 19th, 2017
*/
import java.util.Scanner;

public class Football_QB_Rater {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
// Defines all variables as doubles
		double a =0, b =0, c =0, d =0, completions =0, attempts =0, yards= 0, touchdowns =0, interceptions = 0, passerRating = 0, MAX = 2.375, MIN = 0, qbRating = 0, sacks = 0, sackYards = 0 ; 

	System.out.println("Number of completions: ");
	completions = input.nextDouble();

	System.out.println("Number of attempts: ");
	attempts = input.nextDouble();
		
	System.out.println("Number of yards: ");
	yards = input.nextDouble();
		
	System.out.println("Number of touchdowns: ");
	touchdowns = input.nextDouble();
		
	System.out.println("Number of interceptions: ");
	interceptions = input.nextDouble();
		
// Completion percentage formula
//	completionPercentage
	a = ((completions/attempts)-.3)*5;

// Yards per attempt formula
//	yardsPerAttempt
	b= ((yards/attempts)-3)*.25;
		
// Touchdowns per attempt formula
//	tdPerAttempt
	c= (touchdowns/attempts)*20;
		
// Interceptions per Attempt formula
//	intPerAttempt
	d = 2.375 - ((interceptions/attempts)*25);
		
	if (a > 2.375){
		a = 2.375;
	}
	if (a < 0){
		a = 0;
	}
	if (b > 2.375){
		b = 2.375;
	}
	if (b < 0){
		b = 0;
	}
	if (c > 2.375){
		c = 2.375;
	}
	if (c < 0){
		c = 0;
	}
	if (d > 2.375){
		d = 2.375;
	}
	if (d < 0){
		d = 0;
	}



// Passer Rating formula
	passerRating= ((a+b+c+d)/6)*100;
	
	System.out.printf("Completion percentage (a) is: %.1f\n", (completions/attempts)*100);
	System.out.printf("Yards per Attempt (b) is: %.1f\n", (yards/attempts));
	System.out.printf("Touchdowns per attempt (c) is: %.1f\n", (touchdowns/attempts)*100);
	System.out.printf("Interceptions per attempt (d) is: %.1f\n", (interceptions/attempts)*100);
	System.out.printf("Passer rating is: %.1f", passerRating);

	}

}
