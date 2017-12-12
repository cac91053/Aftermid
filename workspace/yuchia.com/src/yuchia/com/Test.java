package yuchia.com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("問題以下誰年紀最大?");
		System.out.println("1.周杰倫");
		System.out.println("2.華晨宇");
		System.out.println("3.梁朝偉");
		System.out.println("答案為:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int answer = Integer.parseInt(line);
		if (answer == 3) {
		System.out.println("正確");
	}else{
		System.out.println("不對ㄝ");




	}
}
}
