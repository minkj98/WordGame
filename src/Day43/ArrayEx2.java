package Day43;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		//{ , , ,  } ���� 4�� �ǹ�
		// {0, 0, 0, 0, 0} ���� �ǹ�
		System.out.println(a.length); // ���� ����
		System.out.println(a[0].length); // value�� ����
		System.out.println(a[1].length);
		
		int num = 10;
		//�迭 ��ȸ �� �Է�
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				//System.out.println(i + "/" + j + " ");
				a[i][j] = num;
				num++;
			}
			//System.out.println();
		}
		//�迭 ��ȸ �� ���
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
	}   

}
