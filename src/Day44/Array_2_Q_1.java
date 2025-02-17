package Day44;

public class Array_2_Q_1 {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=20;
		//배열순회 값 입력
		for(int i=0; i<a.length; i++) {
			if(i % 2 != 0) { // 홀수 행을 걸러내기 위한 조건문 
				for(int j=0; j<a[0].length; j++) {
					a[i][j]=num;
					num--;
				}
			}else { // i가 홀수 행이 아니라면 
				for(int j=4; j >= 0; j--) {
					a[i][j]=num;
					num--;
				}
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
