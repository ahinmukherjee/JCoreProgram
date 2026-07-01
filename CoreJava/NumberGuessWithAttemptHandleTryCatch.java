import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberGuessWithAttemptHandleTryCatch{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Random  r=new Random();
	int number=r.nextInt(10);
	int guess;
	int attempt=0;
	System.out.println("Game Start.");
	try{
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
		}
		catch(InputMismatchException e){
			System.out.println("Plz enter valid number."+e);
			}
        finally{
            sc.close();
        }
	}
}