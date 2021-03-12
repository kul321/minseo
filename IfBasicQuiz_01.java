package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
//	 + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//		>> Input Number : -3
//		>> 음수입니다
	
	
//
//	 + 입력한 데이터가 3의 배수인지 판별하시오
//	  (% 연산자 사용)
//		>> Input Number : 7
//		>> 3의 배수가 아닙니다
//
//	 + 두 수를 입력 받아 큰 수를 출력하시오
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 이 더 큰 수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//-----------------Q1--------------------------------
		System.out.println(" Q1.숫자를 입력하시오 : ");//질문
		int num1 = sc.nextInt();
		
		if ( num1 > 0) {	  //양수
			System.out.println("=>숫자["+num1+"]은/는 양수");
		} else if( num1 <0) { //음수
			System.out.println("=>숫자["+num1+"]은/는 음수");
		} else 				  //0
			System.out.println("=>숫자["+num1+"]은/는 0");
		
		//------------------Q2--------------------------------
		System.out.println("\n Q2.숫자를 입력하시오 : ");//질문
		int num2 = sc.nextInt();
		
		if ( num2%3 == 0) {
			System.out.println("=>숫자["+num2+"]은/는 3의 배수");
		} else {
			System.out.println("=>숫자["+num2+"]은/는 3의 배수가 아님");
		}
		
		//------------------Q3----------------------------------
		System.out.println("\n Q3.첫 번째 숫자를 입력하시오 : \n");//질문
		
		int num3 = sc.nextInt();
		System.out.println(" 두 번째 숫자를 입력하시오 : ");//질문
		int num4 = sc.nextInt();
		
		if (num3 > num4) {
			System.out.println("=>첫 번째 숫자["+num3+"]이/가 두 번째 숫자["+num4+"]보다 크다");
		} else if ( num4>num3 ) {
			System.out.println("=>두 번째 숫자["+num4+"]이/가 첫 번째 숫자["+num3+"]보다 크다");
		} else
			System.out.println("=>두 수의 크기가 같다");
		
	}

}
