package ����for;

public class exam {

	public static void main(String[] args) {
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,2};
		int cnt;
		System.out.println(pang.length + "���� �迭");
		for(int i = 0; i < pang.length - 2; i++) {
			System.out.print(i + " : ");
			cnt = 1;
			for(int j = i + 1; pang[i] == pang[j]; j++) {
				System.out.print(j + " ");
				cnt++;
				if(j == pang.length - 1) {
					break; //���� �ݺ����� ����
				}		   //���⼭ ���� �ݺ����� 11�� for
			}
			if(cnt >= 3) {
				System.out.println("�� ����: " + cnt);
				i += cnt;
			}
			System.out.println();
			
		}

	}

}
