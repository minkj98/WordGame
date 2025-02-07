package 이중for;

public class ex07 {
	public static void main(String[] args) {
		int[] a ={34,55,23,56,34,45,34};
		int[] b ={36,49};
		int cnt1 = 0; // 배열 b의 0번 인덱스보다 큰 값의 갯수
		int cnt2 = 0; // 배열 b의 1번 인덱스보다 큰 값의 갯수
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= b[0]) {
				cnt1++;
			}
			if(a[i] >= b[1]) {
				cnt2++;
			}
		}
		System.out.println("a 배열의 값에는 36보다 큰 숫자는" + cnt1 + "개 있습니다.");
		System.out.print("a 배열의 값에는 49보다 큰 숫자는" + cnt2 + "개 있습니다.");
	}

}
