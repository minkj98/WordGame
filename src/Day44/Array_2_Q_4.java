package Day44;
import java.util.Arrays;
public class Array_2_Q_4 {
	public static void main(String[] args) {
		int maxCnt = 3;
		int numCnt = 0;
		int[][] twoDimension = {{1, 1, 0, 2},
								{3, 2, 1, 2},
								{0, 0, 3, 2},
								{4, 4, 4, 4},
								{2, 4, 3, 1},
								{2, 4, 1, 3}
								};
		
		// System.out.println(Arrays.deepToString(twoDimension));
		
		
		
		for(int i = 0; i < twoDimension.length; i++) {
			for(int j = 0; j < twoDimension[i].length; j++) {
				if(twoDimension[i][j] == twoDimension[i][j+1]) {
					//System.out.println(twoDimension[i][j]+1); 
					numCnt++;
				}
					
				 if(numCnt >= maxCnt) {
					System.out.println(i + "/" + j);
				
				}
					
			}
				
			
			
			
		} 
		
	}

}
