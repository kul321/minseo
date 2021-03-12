package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_02 {
//	 + 세 수를 입력 받아 가장 큰 수를 출력하시오
//
//	 + 두 수를 입력 받아 합이 짝수이고
//	  3의 배수인지 판별하시오
//
//	 + 세 과목의 성적을 입력 받아 합계와 평균을 구하고
//	  평균이 90이상이면 "A", 80이상이면 "B",
//	  70 이상이면 "C", 60 이상이면 "D",
//	  60미만이면 "F" 를 출력하시오.
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//------------------Q1----------------------
		System.out.println("Q1. 세 개의 숫자를 입력하세요");
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 숫자: ");
		int num3 = sc.nextInt();
		
		if ( num1 >= num2 && num1 >= num3) {
			System.out.println("가장 큰 수는 "+num1+"입니다");
			} else if ( num2 >= num1 && num1 >= num3) {
				System.out.println("가장 큰 수는 "+num2+"입니다");
			} else {
				System.out.println("가장 큰 수는 "+num3+"입니다");
			}
		System.out.println("-------------------------------\n");
		//------------------Q2-----------------------
		System.out.println("Q2. 두 개의 숫자를 입력하세요");
		System.out.print("첫 번째 숫자: ");
		int num4 = sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int num5 = sc.nextInt();
		
		if ((num4 + num5)%2 == 0) {
			 if ((num4+num5)%3 == 0) {
				 System.out.println("두 숫자의 합은 짝수이고 3의 배수입니다");
			 } else
				 System.out.println("두 숫자의 합은 짝수이지만 3의 배수가 아닙니다");
		} else {
			if ((num4+num5)%3 == 0) {
				System.out.println("두 숫자의 합은 짝수가 아니지만 3의 배수입니다");
			} else
				System.out.println("두 숫자의 합은 짝수가 아니고 3의 배수도 아닙니다");
		}
		System.out.println("-------------------------------\n");
		//--------------------Q3-------------------------
		System.out.println("Q3. 세 과목의 성적을 입력하세요");
		System.out.print("과목1의 점수: ");
		int sub1 = sc.nextInt();
		System.out.print("과목2의 점수: ");
		int sub2 = sc.nextInt();
		System.out.print("과목3의 점수: ");
		int sub3 = sc.nextInt();
		
		int sum = sub1+sub2+sub3;
		double avg = sum/(double)3;
			
		if(avg>=0 && avg<=100) {
			if (avg >= 90) {
				System.out.print("평균 약 ");
				System.out.printf("%.2f", avg);
				System.out.print("점으로 A학점입니다");
				}
				else if (avg >= 80) {
					System.out.print("평균 약 ");
					System.out.printf("%.2f", avg);
					System.out.print("점으로 B학점입니다");
				}
				else if (avg >= 70) {
					System.out.print("평균 약 ");
					System.out.printf("%.2f", avg);
					System.out.print("점으로 C학점입니다");
				}
				else if (avg >= 60) {
					System.out.print("평균 약 ");
					System.out.printf("%.2f", avg);
					System.out.print("점으로 D학점입니다");
				} else {
					System.out.print("평균 약 ");
					System.out.printf("%.2f", avg);
					System.out.print("점으로 F학점입니다");
				}
			}	else {
				System.out.println("점수를 잘못 입력하셨습니다");
			}
		
		
		//1번 문제 2번 문제 max sum 등의 변수를 만들어서도 생각해보기
		//2번 문제 sum%2 ==0 && sum%3==0
		//2번 문제 if (sum%6==0){<- 이런식으로 공배수를 이용하는 방법
	}
}