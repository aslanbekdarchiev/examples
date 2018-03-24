import java.util.Random;
import java.util.Scanner;

public class QuessNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int me;
		int java = rand.nextInt(10);
		int counter = 3;
System.out.println(java);
		do {

			if (counter == 0) {
				System.out.println("Game over");
				break;
			} else {
				System.out.println("Chance number " + counter + ", enter number in range of 10 : ");
				me = scan.nextInt();
				if (me < java)
					System.out.println("too small");
				else if (me > java)
					System.out.println("too big");
				else {
					System.out.println("got it");
					break;
				}
			}
			counter--;
		} while (true);
	}
}
