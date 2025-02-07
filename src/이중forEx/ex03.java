package ¿Ã¡ﬂforEx;

public class ex03 {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
		      for(int j = 0; j < i; j++){
		        System.out.print(" ");
		      }
		      for(int j = 0; j < 7 - i * 2; j++){
		        System.out.print("*");
		      }
		      System.out.println();

		 }
	}

}
