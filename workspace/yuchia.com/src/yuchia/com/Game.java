package yuchia.com;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int hp = 100;
		System.out.println("當前hp" + hp);
		for (int a = 1; a > 0; a++) {
		System.out.print("請輸入一個數字2 4 8 6 0其中一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);	
			switch (number) {
			case 2:
				System.out.println("向下 ");
				break;
			case 4:
				System.out.println("向左");
				
				break;
			case 8:
				System.out.println("向上 ");
				
				break;
			case 6:
				System.out.println("向右 ");
				break;
			case 0:
				break;
			
				
				
				
				
			}
			if(number==0){
				break;
			
			}
		}
	}

  }
}