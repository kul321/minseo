package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number : ");
		int num = sc.nextInt();
		
		//입력한 숫자가 홀수/짝수 판별하는 코드 작성
		
		if (num%2 == 0) {//짝수, even number -> 2로 나누어 떨어지는 수
			System.out.println("num["+num+"] - 짝수");
		}	else {
			System.out.println("num["+num+"] - 홀수");
		}
				
		
		
	}
}
