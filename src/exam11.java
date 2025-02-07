import java.util.Random;

public class exam11{
	public static void main(String[] args){
		int[] lotto = new int[45];
		Random R = new Random();

		for(int i = 0; i < 1000; i++){
			int a = R.nextInt(45);
			lotto[a] = lotto[a] + 1;
		}
		for(int i = 0; i < 45; i++){
			System.out.println(i + 1 + "¹ø: " + lotto[i] + lotto[i] * 100 / 1000);
		}
	}
}