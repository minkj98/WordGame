package ����for;

public class ex07 {
	public static void main(String[] args) {
		int[] a ={34,55,23,56,34,45,34};
		int[] b ={36,49};
		int cnt1 = 0; // �迭 b�� 0�� �ε������� ū ���� ����
		int cnt2 = 0; // �迭 b�� 1�� �ε������� ū ���� ����
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= b[0]) {
				cnt1++;
			}
			if(a[i] >= b[1]) {
				cnt2++;
			}
		}
		System.out.println("a �迭�� ������ 36���� ū ���ڴ�" + cnt1 + "�� �ֽ��ϴ�.");
		System.out.print("a �迭�� ������ 49���� ū ���ڴ�" + cnt2 + "�� �ֽ��ϴ�.");
	}

}
