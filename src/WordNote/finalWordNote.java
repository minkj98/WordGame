package WordNote;

import java.util.Scanner;

public class finalWordNote {
	static String[] Word = new String[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("영단어 암기 및 시험 프로젝트입니다");
		System.out.println("원하는 메뉴의 숫자를 입력해주세요");
		System.out.println();
		System.out.println("1.시작   2.종료");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int Start = s.nextInt();
			if (Start == 1) {
				InputWord();
			} else if (Start == 2) {
				stop();
			} else {
				System.out.println("입력오류 해당 메뉴 숫자를 입력해 주십시오"); // 입력숫자 오류시 for문 다시 반복
				System.out.println();
				System.out.println("1.시작   2.종료");
				continue;
			}
		}
	}

	public static void print() { // 입력한 단어 전체출력
		for (int i = 0; i < Word.length; i++) {
			System.out.println((i + 1) + "." + Word[i]);
		}
		System.out.println();
		System.out.println("1.입력단어 가리기(암기시작)  2.단어 재입력  3.종료");
		Scanner s = new Scanner(System.in);
		int Num = s.nextInt();
		if (Num == 1) {
			gard();
		} else if (Num == 2) {
			InputWord();
		} else if (Num == 3) {
			stop();
		}

	}

	public static void move() { // 모니터 정보창 줄정리용도
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void stop() { // 종료 메서드
		System.out.println("프로그램을 종료합니다");
	}

	public static void InputWord() { // 단어 입력 저장 기능
		move();
		move();
		System.out.println("저장할 단어를 입력해주세요 (최대5개 단어저장)");
		System.out.println();
		System.out.println();
		int cnt = 4;
		Scanner ss = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			Scanner s = new Scanner(System.in);
			String make = s.nextLine(); // 단어입력
			if (make == "") { // 입력안했을시 공백으로 남길지 단어재작성을 할지여부 선
				move();
				move();
				System.out.println("단어를 입력하지 않았습니다 공백으로 표기됩니다");
				System.out.println("메뉴 이동을 원할시 해당 번호를 입력해주세요");
				System.out.println();
				System.out.println("1.계속입력(저장되지않습니다)  2.단어 재작성  3.종료");
				for (int j = 0; j < 1; j++) {
					int num = s.nextInt();
					s.nextLine();
					if (num == 1) {
						continue;
					} else if (num == 2) {
						InputWord();
					} else {
						stop();
					}
				}
			}
			Word[i] = make;
			System.out.println("저장단어 " + (i + 1) + "개 입력하셨습니다 남은 저장횟수 " + (cnt--));
		}
		System.out.println("저장횟수 모두 사용하셨습니다");
		move();
		System.out.println("메뉴 이동을 원할시 해당 번호를 입력해주세요");
		System.out.println();
		System.out.println("1.입력단어 전체출력  2.단어 재입력  3.종료");
		int num = ss.nextInt(); // 메뉴이동
		if (num == 1) {
			print();
		} else if (num == 2) {
			InputWord();
		} else {
			stop();
		}
	}

	public static void gard() { // 출력된 단어 가리기 (암기용도) 암기후 단어재출력, 재입력, 종료여부 파악
		move();
		System.out.println("입력한 단어를 암기하시오");
		System.out.println("메뉴 필요시 해당 번호를 입력하시오");
		System.out.println();
		System.out.println("1.입력단어 전체출력  2.단어 재입력  3. 종료");
		Scanner s = new Scanner(System.in);
		int Num = s.nextInt();
		if (Num == 1) {
			print();
		} else if (Num == 2) {
			InputWord();
		} else if (Num == 3) {
			stop();
		}
	}

	public static void SeeWord() { // -------->>해당 메서드는 타자게임시 넣을지 삭제할지 협의
		System.out.println("저장된 영단어를 모두 출력합니다");
		for (int i = 0; i < Word.length; i++) {
			System.out.println((i + 1) + "." + Word[i]);
		}
		Scanner s = new Scanner(System.in);
		System.out.println("모든 단어가 출력되었습니다");
		System.out.println("메뉴 이동을 원할시 아래 번호를 입력해주세요");
		System.out.println();
		System.out.println("1. 영단어 재입력  2. 출력된 단어 가리기  3. 종료");
		int Num = s.nextInt();
		if (Num == 1) {
			InputWord();
		} else if (Num == 2) {
			gard();
		} else if (Num == 3) {
			stop();
		}
	}

	public static void SearchWord() { // 영단어 검색 앞글자 스펠링만 적어도 전체검색 혹은, 모든단어 맞을떄 전체검색 (내일협의)
		for (int i = 0; i < Word.length; i++) {
			Scanner s = new Scanner(System.in);
			String SearcWord = s.nextLine();
			if (Word[i].charAt(i) == SearcWord.charAt(i)) {
				System.out.println(Word[i]);
			} else {
				System.out.println("해당단어는 없음으로 전체단어를 출력합니다");
				SeeWord();
			}
			if (Word[i].equals(SearcWord)) {
				System.out.println(Word[i]);
			} else {
				System.out.println("해당단어는 없음으로 전체단어를 출력합니다");
				SeeWord();
			}
		}

	}

}
