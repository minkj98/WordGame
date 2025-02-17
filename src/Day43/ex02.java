package Day43;
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int userInputNumber = Scan.nextInt(); // a
		
		
		if(userInputNumber % 2 == 0) { // b
			System.out.println("짝수입니다."); //c
		}else {
			System.out.println("홀수입니다."); //d
		} //e
	}

}
