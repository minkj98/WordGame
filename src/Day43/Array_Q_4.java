package Day43;

public class Array_Q_4 {
	public static void main(String[] args) {
		
		int[][] a = {
				{ 10, 11, 12, 13, 14 },
				{ 20, 21, 22, 23, 24 },
				{ 30, 31, 32, 33, 34 },
				{ 40, 41, 42, 43, 44 }
				};
		
				int evenCnt = 0;
				
				//�迭��ȸ �� �Է�
				for(int i=0; i < a.length; i++) {
					for(int j = 0; j < a[0].length; j++) {
						if(j % 2 == 0) {
							evenCnt++;
						}
						
					}
					
					
				}
				System.out.println("a �迭�� ¦���� " + evenCnt + "�� �Դϴ�.");
				
					
				
		

	}

}
