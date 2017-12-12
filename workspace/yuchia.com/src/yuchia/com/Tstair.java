package yuchia.com;

import java.util.Scanner;

public class Tstair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請使用者輸入一個數字，印出階梯型的星號和井號");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int c = Integer.parseInt(line);
		for (int i = 1; i <= c; i++) {
		for (int j = 1; j <= c; j++) {
				if (j <= i)
				System.out.print("*");
				else 
				if (j <= c)
				System.out.print("#");
				
		}
			
				System.out.println();
		}
	}
}

