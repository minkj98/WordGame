import java.util.*;

public class Day2_04 {

	public static void main(String[] args) {
		// �迭 Ư¡: ���� ���������� �Ҵ�, ��������
		// ���� ������, ����(�ε���), value�� ���� �м��Ѵ�.
		//����
		int[] lotto = {6, 12, 33, 4, 5, 26};
		int temp = lotto[5];
		
		lotto[5] = lotto[4];
		lotto[4] = lotto[3];
		lotto[3] = lotto[2];
		lotto[2] = lotto[1];
		lotto[1] = lotto[0];
		lotto[0] = temp;
		System.out.println(Arrays.toString(lotto));
	}
}