package WordNote;

import java.util.Scanner;

public class finalWordNote {
	static String[] Word = new String[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ܾ� �ϱ� �� ���� ������Ʈ�Դϴ�");
		System.out.println("���ϴ� �޴��� ���ڸ� �Է����ּ���");
		System.out.println();
		System.out.println("1.����   2.����");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int Start = s.nextInt();
			if (Start == 1) {
				InputWord();
			} else if (Start == 2) {
				stop();
			} else {
				System.out.println("�Է¿��� �ش� �޴� ���ڸ� �Է��� �ֽʽÿ�"); // �Է¼��� ������ for�� �ٽ� �ݺ�
				System.out.println();
				System.out.println("1.����   2.����");
				continue;
			}
		}
	}

	public static void print() { // �Է��� �ܾ� ��ü���
		for (int i = 0; i < Word.length; i++) {
			System.out.println((i + 1) + "." + Word[i]);
		}
		System.out.println();
		System.out.println("1.�Է´ܾ� ������(�ϱ����)  2.�ܾ� ���Է�  3.����");
		Scanner s = new Scanner(System.in);
		int Num = s.nextInt();
		if (Num == 1) {
			gard();
		} else if (Num == 2) {
			InputWord();
		} else if (Num == 3) {
			stop();
		}

	}

	public static void move() { // ����� ����â �������뵵
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void stop() { // ���� �޼���
		System.out.println("���α׷��� �����մϴ�");
	}

	public static void InputWord() { // �ܾ� �Է� ���� ���
		move();
		move();
		System.out.println("������ �ܾ �Է����ּ��� (�ִ�5�� �ܾ�����)");
		System.out.println();
		System.out.println();
		int cnt = 4;
		Scanner ss = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			Scanner s = new Scanner(System.in);
			String make = s.nextLine(); // �ܾ��Է�
			if (make == "") { // �Է¾������� �������� ������ �ܾ����ۼ��� �������� ��
				move();
				move();
				System.out.println("�ܾ �Է����� �ʾҽ��ϴ� �������� ǥ��˴ϴ�");
				System.out.println("�޴� �̵��� ���ҽ� �ش� ��ȣ�� �Է����ּ���");
				System.out.println();
				System.out.println("1.����Է�(��������ʽ��ϴ�)  2.�ܾ� ���ۼ�  3.����");
				for (int j = 0; j < 1; j++) {
					int num = s.nextInt();
					s.nextLine();
					if (num == 1) {
						continue;
					} else if (num == 2) {
						InputWord();
					} else {
						stop();
					}
				}
			}
			Word[i] = make;
			System.out.println("����ܾ� " + (i + 1) + "�� �Է��ϼ̽��ϴ� ���� ����Ƚ�� " + (cnt--));
		}
		System.out.println("����Ƚ�� ��� ����ϼ̽��ϴ�");
		move();
		System.out.println("�޴� �̵��� ���ҽ� �ش� ��ȣ�� �Է����ּ���");
		System.out.println();
		System.out.println("1.�Է´ܾ� ��ü���  2.�ܾ� ���Է�  3.����");
		int num = ss.nextInt(); // �޴��̵�
		if (num == 1) {
			print();
		} else if (num == 2) {
			InputWord();
		} else {
			stop();
		}
	}

	public static void gard() { // ��µ� �ܾ� ������ (�ϱ�뵵) �ϱ��� �ܾ������, ���Է�, ���Ῡ�� �ľ�
		move();
		System.out.println("�Է��� �ܾ �ϱ��Ͻÿ�");
		System.out.println("�޴� �ʿ�� �ش� ��ȣ�� �Է��Ͻÿ�");
		System.out.println();
		System.out.println("1.�Է´ܾ� ��ü���  2.�ܾ� ���Է�  3. ����");
		Scanner s = new Scanner(System.in);
		int Num = s.nextInt();
		if (Num == 1) {
			print();
		} else if (Num == 2) {
			InputWord();
		} else if (Num == 3) {
			stop();
		}
	}

	public static void SeeWord() { // -------->>�ش� �޼���� Ÿ�ڰ��ӽ� ������ �������� ����
		System.out.println("����� ���ܾ ��� ����մϴ�");
		for (int i = 0; i < Word.length; i++) {
			System.out.println((i + 1) + "." + Word[i]);
		}
		Scanner s = new Scanner(System.in);
		System.out.println("��� �ܾ ��µǾ����ϴ�");
		System.out.println("�޴� �̵��� ���ҽ� �Ʒ� ��ȣ�� �Է����ּ���");
		System.out.println();
		System.out.println("1. ���ܾ� ���Է�  2. ��µ� �ܾ� ������  3. ����");
		int Num = s.nextInt();
		if (Num == 1) {
			InputWord();
		} else if (Num == 2) {
			gard();
		} else if (Num == 3) {
			stop();
		}
	}

	public static void SearchWord() { // ���ܾ� �˻� �ձ��� ���縵�� ��� ��ü�˻� Ȥ��, ���ܾ� ������ ��ü�˻� (��������)
		for (int i = 0; i < Word.length; i++) {
			Scanner s = new Scanner(System.in);
			String SearcWord = s.nextLine();
			if (Word[i].charAt(i) == SearcWord.charAt(i)) {
				System.out.println(Word[i]);
			} else {
				System.out.println("�ش�ܾ�� �������� ��ü�ܾ ����մϴ�");
				SeeWord();
			}
			if (Word[i].equals(SearcWord)) {
				System.out.println(Word[i]);
			} else {
				System.out.println("�ش�ܾ�� �������� ��ü�ܾ ����մϴ�");
				SeeWord();
			}
		}

	}

}
