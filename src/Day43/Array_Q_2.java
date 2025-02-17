package Day43;

public class Array_Q_2 {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=10;
		
		//배열순회 값 입력
		for(int j=0; j<a[0].length; j++) {
			for(int i=0; i<a.length; i++) {
				a[i][j]=num;
				num++;
			}
			//System.out.println();
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
