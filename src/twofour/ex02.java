package twofour;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("�̸��� �Է��ϼ���: ");
			String name = in.nextLine();
			
			System.out.println("�Է��Ͻ� �̸���" + name);
			System.out.println("�Է��Ͻ� �̸��� ���̴�: " + name.length() + "�Դϴ�.");
			
			System.out.println("���̸� �Է��ϼ���: ");
			int age = in.nextInt();
			in.nextLine(); 
			System.out.println("�Է��Ͻ� ���̴�" + age + "�Դϴ�.");
			
			
			System.out.print("��̸� �Է��ϼ���: ");
			String hobby = in.nextLine(); 
			System.out.println("��̷� " + hobby + " �� �Է��ϼ̽��ϴ�.");
		}
		
		
		


	}

}
