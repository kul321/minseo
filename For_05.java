package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		//1부터 10까지 총합을 구하기
		//	total
		
		int sum = 0; // 총합, 반드시 초기화
		
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		
		
		
		
		//-------------------------------------------
		//패턴 - 어떤 값을 반복적으로 장가(감소)시킬 것인가?
		//반복횟수:	10번
		//반복구간:	1~10
		
		//초기식: int i=1; 	(i변수, 반복구간의 시작값으로 대입)
		//조건식: i <=10;	(i변수, 반복구간의 끝값, 반복 횟수)
		//증감식: i++		(1씩 증가)
		
		int total = 0; // 총합, 반드시 초기화
		for( int i=1; i<=10; i++) { //i, 1~10, x10)
//			total = total + i;
			total += i;
			
		}
		System.out.println("총합: " + total);
	}

}
