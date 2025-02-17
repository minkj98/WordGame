package Day45.main;
import java.util.Random;

public class Ex02 {
	

	
		static int[] lottoNum = new int[6];
		public static void main(String[] args) { //프로그램의 시작점
			for(int i = 0; i < 5; i++){
				randomInt();
				printLotto();
			}
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
