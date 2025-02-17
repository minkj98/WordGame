package Day45.main;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	static int[] lottoNum = new int[6];
	public static void main(String[] args) { //프로그램의 시작점
		Scanner Scan = new Scanner(System.in);
		System.out.println("로또 몇 게임 할래?");
		int num = Scan.nextInt();
		for(int i = 0; i < num; i++){
			randomInt();
			printLotto();
		}
	}
		
	public static void randomInt() {
		Random R = new Random();
		for(int i = 0; i < lottoNum.length; i++) {
			int k = R.nextInt(45) + 1;
			int flag = checkDuplex(k);
			if(flag != -1) {
				i--;
			}else {
				lottoNum[i] = k;
			}
		}
	}
	
	public static int checkDuplex(int a) {
		for(int i = 0; i < lottoNum.length; i++) {
			if(lottoNum[i] == a) {
				return i;
			}
		}
		return -1;
	}
	public static void printLotto() {
		for(int i = 0; i < lottoNum.length; i++) {
		System.out.print(lottoNum[i] + " ");
		}
		System.out.println();
	}

}
