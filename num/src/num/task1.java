package num;
import java.util.Random;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {


				 Random rand = new Random();
			        int num = rand.nextInt(100) + 1;

			        // Attempt
			        for (int i = 5; i > 0; i--) {
			            Scanner Sc = new Scanner(System.in);
			            System.out.println("Enter a Number:");
			            int number = Sc.nextInt();

			            if (number == num) {
			                System.out.println("You win!");
			                break;
			            } else if (number < num) {
			                System.out.println("Too low");
			            } else {
			                System.out.println("Too high");
			            }

			            if (i == 1) {
			                if (number != num) {
			                    System.out.println("Game over!The correct number was: " + num);
			                }
			            }
			        }


	}

}
