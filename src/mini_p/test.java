package mini_p;
import java.util.Scanner;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		
		String[] fWord = {"grape", "melon", "banana", "lemon", "lime", "orange", "cherry", "mango", "papaya", "peach"}; //fWord라는 배열이 있다. 이 배열엔 참조 자료형인 String만 들어간다.
	    //String[] userWord = new String[10];
		int point = 0; // int 자료형이 있다.
	    //int correctScore = 0; // int 자료형 변수가 있다. 초기값은 0이다. 이 변수는 주어진 단어들 중 맞은 갯수를 카운팅한다.
	    //int incorrectScore = 0; // int 자료형 변수가 있다. 초기값은  0이다. 이 변수는 주어진 단어들 중 맞히지 못한 갯수를 카운팅한다.
	    Scanner scan = new Scanner(System.in); //참조 자료형인 scanner 변수가 있다. 사용자의 키보드로부터 값을 입력받는다. 
	    Random rand = new Random(); // 참조 자료형인 rand 변수가 있다. 이 변수는 fword의 값을 랜덤하게 출력한다. 

	    System.out.println("Enter를 입력하면 시작합니다.: "); // 사용자에게 해당 문구를 출력한다. 
	    scan.nextLine(); // 엔터만 읽고 엔터를 제외한 값을 반환한다. 

	    for(int i = 0; i < 10; i++){ //int 자료형인 i가 있다. 초기값은 0이다. i = 0 1 2 3으로 시작해 9까지 반복을 한다
	    	//for(int j = 0; j < 10; j++) { // int 자료형인 j가 있다. j의 초기값은 0이다. j = 0 1 2 3 으로 시작해 9까지 반복한다.
	    
	    	System.out.println(i + 1 + "번 째 단어를 제시합니다.");
	    	String examWord = fWord[rand.nextInt(fWord.length)]; // String 자료형인 examWord 변수가 있다. 반복문을 도는 동안 fWord의 값을 랜덤하게 추출한다.
	    	System.out.println("주어진 단어는" + examWord + "입니다."); // 해당 문구와 랜덤으로 추출된 값을 출력한다.
	    		
	    	System.out.println("주어진 단어에 맞게 입력하세요(종료는 exit입니다.: )");
	    	String userWord = scan.nextLine(); // 랜덤으로 추출된 단어를 보고 사용자가 단어를 입력한다. 
	    	
	    	
	    	if(userWord.equals("exit")) {
	    		System.out.println("exit가 입력되어 타자 프로그램을 종료합니다.");
	    		break;
	    	}
	    	if(userWord.equals(examWord)) {  // 조건문 in문자열과 trywords가 같다면
				System.out.println("정답입니다.");
				System.out.println("10점 드립니다.");
				point += 10;   //10점 가산.
				System.out.println("총점수는:"+ point + "입니다.");				
			}else {
				
			}
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	   

				

	}

}
