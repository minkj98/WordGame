package Day44;

import java.util.Random;

public class Array_2_Q_2 {
	public static void main(String[] args) {
		String[][] a = new String[2][2];
	    Random Rand = new Random();
	    String[] word = { "apple", "book", "java", "oracle", "computer", "html", "dbms", "server" };

	    for (int i = 0; i < a.length; i++) {
	      for (int j = 0; j < a[0].length; j++) {
	        a[i][j] = word[Rand.nextInt(word.length)];
	      }

	    }
	    // 배열 순회 값 출력
	    for (int i = 0; i < a.length; i++) {
	      for (int j = 0; j < a[0].length; j++) {
	        System.out.print(a[i][j] + " ");
	      }
	      System.out.println();
	    }
	}

}
