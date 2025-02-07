
public class Day02 {

	public static void main(String[] args) {
		int win = 0;
		int lose = 0;
		int comp = 0;
	
		win = 10;
		lose = 10;
		comp = 2;
		
		int young = 100;
		int chul = 100;
		
		chul += win;
		chul += win;
		
		young -= lose;
		young -= lose;
		chul -= lose;
		
		young += comp;
		chul += comp;
		
		young += win;
		
		
		
		System.out.println(young);
		System.out.println(chul);
		
  
	}

}
