
public class Day02_t {
	public static void main(String[] args) {
		/*
		 ������ ö���� ���� �⺻ ���� 100���̴�.*/
		int pointYoungsu = 100;
		int pointChulsu = 100;
		 
		 /*
		 ö���� 2�� ���� �̰��. */
		pointChulsu = pointChulsu + 10;
		pointChulsu = pointChulsu + 10;
		pointYoungsu = pointYoungsu - 10;
		pointYoungsu = pointYoungsu - 10;
		
		/*����. */
		pointYoungsu = pointYoungsu + 2;
		pointChulsu = pointChulsu + 2;
		
		
		/* ������ 1�� �̰��. */
		pointYoungsu = pointYoungsu + 10;
		pointChulsu = pointChulsu - 10;
		 
		/* ���� ������ ����Ͻÿ�. */
		System.out.println("������ ����: " + pointYoungsu);
		System.out.println("ö���� ����: " + pointChulsu);
	}

}
