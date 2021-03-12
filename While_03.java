package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
	// while 문을 이용한 구구단 출력
		
		int dan = 2;
		while(dan<=9) {//dan,2~9,x8
			int i=1;
			while(i<=9) {//i,1~9,x9
				System.out.println(dan+"x"+i+"="+(dan*i));
				
				i++;
			}
			System.out.println();
			
			dan++;
		}
		
		
		
			
		
				
	}
}
