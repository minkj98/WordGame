
public class exam {
	public static void main(String[] args) {
		char b = 'z';
		int a = (int) b - 97;             // (a + 2) % 소문자의 전체 갯수
		//System.out.println("원하는 값: " + a);
		//a = (a + 2) % 26 + 97;
		a = ((a+2) % 26) + 97;
		System.out.println("원하는 값: " + (char)a);
		//ystem.out.println("97에서 떨어진 수: " + a);
		// System.out.println(b);
		// System.out.println(b+2); // 결과값 99
		// System.out.println((char)(b+2)); // 결과값 c
 		
		

		
	}	
}
	

