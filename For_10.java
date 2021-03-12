package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		//중첩된 for loop
		//	2~9단 구구단
		
		//2 x 1 = 2
		
		//2단~9단까지 8번 반복 i
		//그 안에서 변수 반복 j
		
		int i;
		int j;
		for (i=2; i<10; i++) {
			System.out.println("-------"+i+"단-------");
			for(j=1; j<10; j++) {
				System.out.print(i + " x "+ j + " = "+ i * j+" ");
			}
		}
	}

}
