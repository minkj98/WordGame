package mini_p;
import java.util.Scanner;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		
		String[] fWord = {"grape", "melon", "banana", "lemon", "lime", "orange", "cherry", "mango", "papaya", "peach"}; //fWord��� �迭�� �ִ�. �� �迭�� ���� �ڷ����� String�� ����.
	    //String[] userWord = new String[10];
		int point = 0; // int �ڷ����� �ִ�.
	    //int correctScore = 0; // int �ڷ��� ������ �ִ�. �ʱⰪ�� 0�̴�. �� ������ �־��� �ܾ�� �� ���� ������ ī�����Ѵ�.
	    //int incorrectScore = 0; // int �ڷ��� ������ �ִ�. �ʱⰪ��  0�̴�. �� ������ �־��� �ܾ�� �� ������ ���� ������ ī�����Ѵ�.
	    Scanner scan = new Scanner(System.in); //���� �ڷ����� scanner ������ �ִ�. ������� Ű����κ��� ���� �Է¹޴´�. 
	    Random rand = new Random(); // ���� �ڷ����� rand ������ �ִ�. �� ������ fword�� ���� �����ϰ� ����Ѵ�. 

	    System.out.println("Enter�� �Է��ϸ� �����մϴ�.: "); // ����ڿ��� �ش� ������ ����Ѵ�. 
	    scan.nextLine(); // ���͸� �а� ���͸� ������ ���� ��ȯ�Ѵ�. 

	    for(int i = 0; i < 10; i++){ //int �ڷ����� i�� �ִ�. �ʱⰪ�� 0�̴�. i = 0 1 2 3���� ������ 9���� �ݺ��� �Ѵ�
	    	//for(int j = 0; j < 10; j++) { // int �ڷ����� j�� �ִ�. j�� �ʱⰪ�� 0�̴�. j = 0 1 2 3 ���� ������ 9���� �ݺ��Ѵ�.
	    
	    	System.out.println(i + 1 + "�� ° �ܾ �����մϴ�.");
	    	String examWord = fWord[rand.nextInt(fWord.length)]; // String �ڷ����� examWord ������ �ִ�. �ݺ����� ���� ���� fWord�� ���� �����ϰ� �����Ѵ�.
	    	System.out.println("�־��� �ܾ��" + examWord + "�Դϴ�."); // �ش� ������ �������� ����� ���� ����Ѵ�.
	    		
	    	System.out.println("�־��� �ܾ �°� �Է��ϼ���(����� exit�Դϴ�.: )");
	    	String userWord = scan.nextLine(); // �������� ����� �ܾ ���� ����ڰ� �ܾ �Է��Ѵ�. 
	    	
	    	
	    	if(userWord.equals("exit")) {
	    		System.out.println("exit�� �ԷµǾ� Ÿ�� ���α׷��� �����մϴ�.");
	    		break;
	    	}
	    	if(userWord.equals(examWord)) {  // ���ǹ� in���ڿ��� trywords�� ���ٸ�
				System.out.println("�����Դϴ�.");
				System.out.println("10�� �帳�ϴ�.");
				point += 10;   //10�� ����.
				System.out.println("��������:"+ point + "�Դϴ�.");				
			}else {
				
			}
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	   

				

	}

}
