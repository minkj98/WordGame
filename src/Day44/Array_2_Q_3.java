package Day44;

import java.util.Random;
import java.util.Scanner;

public class Array_2_Q_3 {
	public static void main(String[] args) {
		String[] word = { "apple", "book", "java", "oracle", "computer", "html", "dbms", "server" };

		String[][] a = new String[2][2];
		Random Rand = new Random();
		Scanner Scan = new Scanner(System.in);
				
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				a[i][j] = word[Rand.nextInt(word.length)];
				
				
			}
		}
		
		// 배열 순회 값 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
		
		System.out.println("주어진 단어를 입력하세요" );
		String userInput = Scan.nextLine();
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				
				
				if(a[i][j].equals(userInput)) {
					System.out.println("성곻입니다.");
					a[i][j] = " ";
				
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");

			}
			
		}

	}

}
