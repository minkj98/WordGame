package Day43;

public class Array_Q_3 {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=10;
		
		//�迭��ȸ �� �Է�
		for(int j=4; j>=0; j--) {
			for(int i=3; i>=0; i--) {
				a[i][j]=num;
				num++;
			}
			//System.out.println();
		}
		//�迭 ��ȸ �� ���
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
