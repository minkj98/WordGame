package 이중for;

public class exam {

	public static void main(String[] args) {
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,2};
		int cnt;
		System.out.println(pang.length + "길이 배열");
		for(int i = 0; i < pang.length - 2; i++) {
			System.out.print(i + " : ");
			cnt = 1;
			for(int j = i + 1; pang[i] == pang[j]; j++) {
				System.out.print(j + " ");
				cnt++;
				if(j == pang.length - 1) {
					break; //현재 반복문을 종료
				}		   //여기서 현재 반복문은 11번 for
			}
			if(cnt >= 3) {
				System.out.println("총 길이: " + cnt);
				i += cnt;
			}
			System.out.println();
			
		}

	}

}
