package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The amount of money that you start with");
		int startAmount = in.nextInt();
		System.out.println("The win probability");
		double winChance = in.nextDouble();
		System.out.println("The amount of monty you had a successful day and leave");
		int winLimit = in.nextInt();

		int num_iterate = 1;
		boolean result = false;
		
		while (startAmount>0 && startAmount < winLimit)
			{
			boolean win = Math.random()<0.7;
			if (win == false) 
			{ startAmount -= 1;}
			else {startAmount += 1;}
			num_iterate += 1;
			}

			if (startAmount == 0) 
			{ result = false; 
			System.out.println(num_iterate + " Loss");
			}
			else 
			{ result = true;
			System.out.println(num_iterate + " Win");
			}
	}

}
