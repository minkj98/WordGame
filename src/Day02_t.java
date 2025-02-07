
public class Day02_t {
	public static void main(String[] args) {
		/*
		 영수와 철수는 각각 기본 점수 100점이다.*/
		int pointYoungsu = 100;
		int pointChulsu = 100;
		 
		 /*
		 철수가 2번 연속 이겼다. */
		pointChulsu = pointChulsu + 10;
		pointChulsu = pointChulsu + 10;
		pointYoungsu = pointYoungsu - 10;
		pointYoungsu = pointYoungsu - 10;
		
		/*비겼다. */
		pointYoungsu = pointYoungsu + 2;
		pointChulsu = pointChulsu + 2;
		
		
		/* 영수가 1번 이겼다. */
		pointYoungsu = pointYoungsu + 10;
		pointChulsu = pointChulsu - 10;
		 
		/* 최종 점수를 출력하시오. */
		System.out.println("영수의 점수: " + pointYoungsu);
		System.out.println("철수의 점수: " + pointChulsu);
	}

}
