package WordNote;
import java.util.Scanner;
import java.util.Arrays;

public class test {
	static String[] engWord = new String[5];
	public static void main(String[] args) {
		System.out.println("단어장 프로그램 시작");
		inputWord();
		
		
		while(true) {
			Scanner Scan = new Scanner(System.in);
			System.out.println("시작 메뉴를 선택하세요");
			System.out.println("1. 전체보기 2. 검색하기");
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
				System.out.println("일치하는 단어는" + engWord[i]);
				
			}else {
				System.out.println("업음");
			}
		}
		
		
		
	}
	

}
