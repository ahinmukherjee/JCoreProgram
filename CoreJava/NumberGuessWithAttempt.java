import java.util.Random;
import java.util.Scanner;

public class NumberGuessWithAttempt{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Random  r=new Random();
	int number=r.nextInt(10);
	int guess;
	int attempt=0;
	System.out.println("Game Start.");
	while(true){
		System.out.print("Enter number:");
		guess=sc.nextInt();
		attempt++;
		System.out.println("Attempt :"+attempt);
		if(attempt==5){
			System.out.println("Attempt end.");
			System.exit(0);
			return;
			}
		if(guess>number){
			System.out.println("Too high!.");
			}
		else if(guess<number){
			System.out.println("Too low!.");
			}
 		else{
			System.out.println("Correct");
			System.out.println("Game end.");
			break;
			}
		}
        sc.close();
	}
}