
public class Day05 {
	public static void main(String[] args) {
		int fiveNum = 56773;
		int sum = 0;
		
		while(fiveNum > 0) {
			sum += fiveNum % 10;
			fiveNum /= 10;
			
			System.out.println("모든 숫자의 합: " + sum);
		}
		

		
	}

}
