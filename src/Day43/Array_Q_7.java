package Day43;

public class Array_Q_7 {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=11;
		//�迭��ȸ �� �Է�
		for(int i=0; i<a.length; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<a[0].length; j++) {
					a[i][j]=num;
					num++;
				}
			}else {
				for(int j=4; j >= 0; j--) {
					a[i][j]=num;
					num++;
				}
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
