
public class exam {
	public static void main(String[] args) {
		char b = 'z';
		int a = (int) b - 97;             // (a + 2) % �ҹ����� ��ü ����
		//System.out.println("���ϴ� ��: " + a);
		//a = (a + 2) % 26 + 97;
		a = ((a+2) % 26) + 97;
		System.out.println("���ϴ� ��: " + (char)a);
		//ystem.out.println("97���� ������ ��: " + a);
		// System.out.println(b);
		// System.out.println(b+2); // ����� 99
		// System.out.println((char)(b+2)); // ����� c
 		
		

		
	}	
}
	

