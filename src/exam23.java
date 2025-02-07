import java.util.Random;
public class exam23 {

	public static void main(String[] args) {
		Random R = new Random();
		/* R.nextInt 테스트 코드
		
		for(int i = 0; i < 10; i++) {
			System.out.println(R.nextInt(5) + 1);
		}*/ 
		//테스트 결과 로또 번호를 추출하는 코드는 
		//R.nextInt(45) + 1로 결정할 수 있다.
		int[] lotto = new int[7];
		//배열 생성 확인 테스트 코드
		/*for(int i = 0; i < 7; i++) {
			System.out.println(i + "/" + lotto[i]);
		}*/
		
		//로또 번호를 하나 뽑아서 변수에 저장한다
		/*int a = R.nextInt(45) + 1;
		//배열에 저장
		lotto[0] = a;
		//로또 번호를 하나 뽑아서 변수에 저장한다
		a = R.nextInt(45) + 1;
		//배열에 저장
		lotto[1] = a;*/
		//이렇게 반복되는 코드를 찾았다. 이제 for문으로 변경
		for(int i = 0; i < 7; i++) {
			//로또 번호를 하나 뽑아서 변수에 저장
			int b = R.nextInt(45) + 1;
			//배열에 저장
			lotto[i] = b;
			
			
		}
		//로또 번호 출력
		for(int i = 0; i < 7; i++) {
			System.out.println(lotto[i]);
		}

	}

}
