package WordNote;
import java.util.Scanner;
import java.util.Arrays;

public class test {
	static String[] engWord = new String[5];
	public static void main(String[] args) {
		System.out.println("�ܾ��� ���α׷� ����");
		inputWord();
		
		
		while(true) {
			Scanner Scan = new Scanner(System.in);
			System.out.println("���� �޴��� �����ϼ���");
			System.out.println("1. ��ü���� 2. �˻��ϱ�");
			int selectNum = Scan.nextInt();
			
			if(selectNum == 1) {
				seeWord();
				
			}
			if(selectNum == 2) {
				searchWord();
			}
			
		
		}
		
	}
	
	public static void inputWord() {
		Scanner Scan = new Scanner(System.in);
		for(int i = 0; i < engWord.length; i++) {
			engWord[i] = Scan.nextLine();
			//System.out.println(engWord[i]);
		}
		
	}
	
	public static void seeWord() {
		System.out.print(Arrays.toString(engWord));
	}
	
	public static void searchWord() {
		Scanner Scan = new Scanner(System.in);
		String userInput = Scan.nextLine();
		for(int i = 0; i < engWord.length; i++) {
			if(engWord[i].equals(userInput)){
				System.out.println("��ġ�ϴ� �ܾ��" + engWord[i]);
				
			}else {
				System.out.println("����");
			}
		}
		
		
		
	}
	

}
