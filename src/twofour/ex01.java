package twofour;

public class ex01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		if(a == b) {
			System.out.println("����1");
		}
		String aa = new String("kim");
		String bb = new String("kim");
		
		System.out.println(aa.length() + "<");
		System.out.println(aa.indexOf("im") + "<<");
		if(aa == bb) {
			System.out.println("����2");
		}
		if(aa.equals(bb)) {
			System.out.println("����3");
		}

	}

}
