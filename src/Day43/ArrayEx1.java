package Day43;

public class ArrayEx1 {
	public static void main(String[] args) {

		int[][] a = { { 10, 11, 12, 13, 14 }, { 20, 21, 22, 23, 24 }, { 30, 31, 32, 33, 34 }, { 40, 41, 42, 43, 44 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}


