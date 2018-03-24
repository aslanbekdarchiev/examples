import java.util.Random;
import java.util.Scanner;

public class RockPaperScisor {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int java;
		int me;
		System.out.println("enter 1 for ROCK\nenter 2 for PAPER\nenter 3 for SCISOR\n\nenter 5 to end the game");
		do {
			do {
				java = rand.nextInt(4);
			} while (java < 1);

			

			me = scan.nextInt();

			if (me < 0 || me > 3) {
				if (me == 5) {
					System.out.println("\n Game over");
					break;
				}
				System.out.println("wrong input");

			}

			else {
				if (me == 1) {
					if (java == 1)
						System.out.println("You ROCK <-> java ROCK\nDRAW");
					else if (java == 2)
						System.out.println("You ROCK <-> java PAPER\nYou LOOSE");
					else
						System.out.println("You ROCK <-> java SCISORS\nYou WIN");
				} else if (me == 2) {
					if (java == 1)
						System.out.println("You PAPER <-> java ROCK\nYou WIN");
					else if (java == 2)
						System.out.println("You PAPER <-> java PAPER\nDRAW");
					else
						System.out.println("You PAPER <-> java SCISORS\nYou LOOSE");
				} else if (me == 3) {
					if (java == 1)
						System.out.println("You SCISORS <-> java ROCK\nYou LOOSE");
					else if (java == 2)
						System.out.println("You SCISORS <-> java PAPER\nYou WIN");
					else
						System.out.println("You SCISORS <-> java SCISORS\nDRAW");
				}
				// if (me == 0)
				// System.out.print("me ROCK <->");
				// else if (me == 1)
				// System.out.print("me PAPER <->");
				// else if (me == 2)
				// System.out.print("me SCISOR <->");
				//
				// if (java == 0)
				// System.out.print(" java ROCK ");
				// else if (java == 1)
				// System.out.print(" java PAPER ");
				// else if (java == 2)
				// System.out.print(" java SCISOR ");
				//
				// if (java == 0 && me == 0)
				// System.out.println("\nagain");
				// else if (java == 0 && me == 1)
				// System.out.println("\nI WIN");
				// else if (java == 0 && me == 2)
				// System.out.println("\nI LOOSE");
				//
				// if (java == 1 && me == 0)
				// System.out.println("\nI LOOSE");
				// else if (java == 1 && me == 1)
				// System.out.println("\nagain");
				// else if (java == 1 && me == 2)
				// System.out.println("\nI WIN");
				//
				// if (java == 2 && me == 0)
				// System.out.println("\nI LOOSE");
				// else if (java == 2 && me == 1)
				// System.out.println("\nI WIN");
				// else if (java == 2 && me == 2)
				// System.out.println("\nagain");
			}
		} while (true);

	}
}