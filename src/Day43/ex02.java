package Day43;
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		int userInputNumber = Scan.nextInt(); // a
		
		
		if(userInputNumber % 2 == 0) { // b
			System.out.println("¦���Դϴ�."); //c
		}else {
			System.out.println("Ȧ���Դϴ�."); //d
		} //e
	}

}
