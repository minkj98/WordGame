package Day43;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		//{ , , ,  } 행의 4개 의미
		// {0, 0, 0, 0, 0} 열을 의미
		System.out.println(a.length); // 행의 갯수
		System.out.println(a[0].length); // value의 길이
		System.out.println(a[1].length);
		
		int num = 10;
		//배열 순회 값 입력
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				//System.out.println(i + "/" + j + " ");
				a[i][j] = num;
				num++;
			}
			//System.out.println();
		}
		//배열 순회 값 출력
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
	}   

}
