package Day45.main;
import java.util.Random;

public class Ex {
	static int[] lottoNum = new int[6];
	public static void main(String[] args) { //���α׷��� ������
		System.out.println("���α׷� ����");
		printLotto();
		randomInt();
		printLotto();
	}
	public static void randomInt() {
		Random R = new Random();
		for(int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = R.nextInt(45) + 1;
		}
	}
	public static void printLotto() {
		for(int i = 0; i < lottoNum.length; i++) {
		System.out.print(lottoNum[i] + " ");
		}
		System.out.println();
	}

}
