package 이중forEx;

public class ex04 {

	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}; //0은 공터를 의미하고 0은 연속적으로 존재함
		int size = 2; // 변수가 있다.. 초기값이 2이다... 건물의 크기를 의미하고 건물을 하나만 지을 수 있음
		int placeCnt = 0; //변수가 있다.. 초기값이 0이다...size 변수가 2일 때 지을 수 있는 건물의 수
		int cnt = 0; // 변수가 있다.. 초기값이 0이다....arr배열 안의 0 갯수를 카운팅 

		for(int i = 0; i < arr.length; i++){  // i는 0 12 34 ..... 18까지다.... i는 arr 배열의 길이만큼 순회를 함 
			cnt = 0; //   위에서 선언한 변수에 0을 대입하였다..                반복문 j가 끝날 때마다 cnt 변수를 0으로 초기화
			for(int j = i; j < arr.length; j++){ //  j의 초기값은 i이다.. i가 1라면 j 1 2 3 4 5 6 -- 18    j는 i와 같은 곳을 바라봄
				if(arr[j] == 0){ // arr[j]== 0 이라면   j 1일때 0 이라면                arr의 j번째 배열이 0과 같다면 if블록 실행
					cnt++; // cnt을 하나 증가해라........ cnt의 정체..     위의 if문이 참이라면 cnt값을 증감
				}else{ //  arr[j]가 0이 아니라면 ... 만약 arr의 j번째 배열이 0이 아닌 1일 경우
					break; // 현재 반복문을 빠져나옴
				}
				//if문에서는 반복되는 0의 개수 만큼 카운트가 올라 가겠네
		
			}
			if(cnt >= size){  // 반복된 영의 갮수   >=  사이즈...      의 갯수가 size와 같거나 클 때 if블록 실행 
				System.out.println(i + "위치의 0은 오른쪽으로 " + cnt + "개 입니다. ");
				placeCnt += (cnt - size + 1);   // 
				i += cnt - 1; 
			}
		}
		System.out.println(placeCnt);

		
		
		
		

	}

}
