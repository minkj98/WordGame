import java.util.Random;
public class exam23 {

	public static void main(String[] args) {
		Random R = new Random();
		/* R.nextInt �׽�Ʈ �ڵ�
		
		for(int i = 0; i < 10; i++) {
			System.out.println(R.nextInt(5) + 1);
		}*/ 
		//�׽�Ʈ ��� �ζ� ��ȣ�� �����ϴ� �ڵ�� 
		//R.nextInt(45) + 1�� ������ �� �ִ�.
		int[] lotto = new int[7];
		//�迭 ���� Ȯ�� �׽�Ʈ �ڵ�
		/*for(int i = 0; i < 7; i++) {
			System.out.println(i + "/" + lotto[i]);
		}*/
		
		//�ζ� ��ȣ�� �ϳ� �̾Ƽ� ������ �����Ѵ�
		/*int a = R.nextInt(45) + 1;
		//�迭�� ����
		lotto[0] = a;
		//�ζ� ��ȣ�� �ϳ� �̾Ƽ� ������ �����Ѵ�
		a = R.nextInt(45) + 1;
		//�迭�� ����
		lotto[1] = a;*/
		//�̷��� �ݺ��Ǵ� �ڵ带 ã�Ҵ�. ���� for������ ����
		for(int i = 0; i < 7; i++) {
			//�ζ� ��ȣ�� �ϳ� �̾Ƽ� ������ ����
			int b = R.nextInt(45) + 1;
			//�迭�� ����
			lotto[i] = b;
			
			
		}
		//�ζ� ��ȣ ���
		for(int i = 0; i < 7; i++) {
			System.out.println(lotto[i]);
		}

	}

}
