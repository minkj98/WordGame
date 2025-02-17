package Day43;
import java.util.Random;


public class Array_Q_6 {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		Random Rand = new Random();
		
		//배열순회 값 입력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				a[i][j] = Rand.nextInt(5) + 1;
			}
			
		}
		//배열 순회 값 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
