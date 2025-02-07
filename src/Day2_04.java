import java.util.*;

public class Day2_04 {

	public static void main(String[] args) {
		// 배열 특징: 값을 연속적으로 할당, 고정길이
		// 참조 변수명, 길이(인덱스), value를 먼저 분석한다.
		//선언
		int[] lotto = {6, 12, 33, 4, 5, 26};
		int temp = lotto[5];
		
		lotto[5] = lotto[4];
		lotto[4] = lotto[3];
		lotto[3] = lotto[2];
		lotto[2] = lotto[1];
		lotto[1] = lotto[0];
		lotto[0] = temp;
		System.out.println(Arrays.toString(lotto));
	}
}