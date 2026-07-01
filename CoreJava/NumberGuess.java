import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Random  r=new Random();
	int number=r.nextInt(10);
	int guess;
	System.out.println("Game Start.");
	while(true){
		System.out.print("Enter number:");
		guess=sc.nextInt();
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