import java.util.Scanner;
import java.util.Random;

public class test02 {

	public static void main(String[] args) {
		String[] a = {"apple", "banana", "plum", "pear", "orange", "grape", "peach", "lychee", "guava", "lemon"};

		Scanner s=new Scanner(System.in);
		Random r = new Random();

		System.out.println("���͸� ������ �����������մϴ�");
		s.nextLine();

		int point=0; // �� ������ ���� ����
		int ppoint=0; // �κ� ������ ���� ����

		for (int j=0; j<5; j++) {
			int num=r.nextInt(a.length); // a�迭 �ε�����ȣ
			System.out.println();
			System.out.println("������ �ܾ ����մϴ�");
			System.out.println(a[num]);
			System.out.println("���õ� �ܾ �Է��Ͻÿ�");
			String key=s.nextLine();

			if (key.equals("exit")) {
				System.out.println("������ �����մϴ�");
				break;
			}

			if(a[num].equals(key)) {
				point+=20;
				System.out.println("�����Դϴ� �ջ����� "+point+"�Դϴ�.");
			}else { // Ʋ���� �κ����� �ݿ�
				for (int i=0; i<a[num].length(); i++) {
					ppoint=0;
					if (a[num].charAt(i)==key.charAt(i)) {
						ppoint+=1;
						point+=ppoint;
						System.out.println((i+1)+"��° ���ĺ� �����Դϴ�. �κ����� "+ppoint+"��ŭ �������� �߰��˴ϴ�." );
					}
				}
			}
		}
			System.out.println();
			System.out.println("��������="+point);

	}
}
