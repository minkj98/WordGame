import java.util.Scanner;
import java.util.Random;

public class test02 {

	public static void main(String[] args) {
		String[] a = {"apple", "banana", "plum", "pear", "orange", "grape", "peach", "lychee", "guava", "lemon"};

		Scanner s=new Scanner(System.in);
		Random r = new Random();

		System.out.println("엔터를 누르면 게임을시작합니다");
		s.nextLine();

		int point=0; // 총 점수를 위한 변수
		int ppoint=0; // 부분 점수를 위한 변수

		for (int j=0; j<5; j++) {
			int num=r.nextInt(a.length); // a배열 인덱스번호
			System.out.println();
			System.out.println("랜덤한 단어를 출력합니다");
			System.out.println(a[num]);
			System.out.println("제시된 단어를 입력하시오");
			String key=s.nextLine();

			if (key.equals("exit")) {
				System.out.println("게임을 종료합니다");
				break;
			}

			if(a[num].equals(key)) {
				point+=20;
				System.out.println("정답입니다 합산점수 "+point+"입니다.");
			}else { // 틀릴시 부분점수 반영
				for (int i=0; i<a[num].length(); i++) {
					ppoint=0;
					if (a[num].charAt(i)==key.charAt(i)) {
						ppoint+=1;
						point+=ppoint;
						System.out.println((i+1)+"번째 알파벳 정답입니다. 부분점수 "+ppoint+"만큼 총점수에 추가됩니다." );
					}
				}
			}
		}
			System.out.println();
			System.out.println("총점수는="+point);

	}
}
