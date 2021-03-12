package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	//학생 정보 관리 프로그램
	//	이름, 나이, 성별, 국어, 영어, 수학
	//	6가지 정보를 저장할 수 있는 변수를 만들고
	//	총점과 평균을 포함한 결과를 출력한다
	
//동작 예시)
//===== 입력 =====
//Input Name : Alice
//Input Age : 33
//Input Gender : F
//Input Korean : 100
//Input English : 99
//Input Mathematics : 97

//===== 출력 =====
//이름	나이	성별	국어	영어	수학	총점	평균
//Alice	33		F		100		99		97		296		98.666666667

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력 객체
		
		final int SUBJECT = 3; //총 과목 수 (상수)
		
		//---------------------------------------------------------
		
		//이름 입력
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("[TEST] name : " + name);
		
		
		//나이 입력
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println("[TEST] age : " + age);
		
		
		//성별 입력 ( M/F )
		System.out.print("성별을 입력하세요(M/F) : ");
		sc.nextLine(); //입력 버퍼 비우기
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("[TEST] gender : " + gender);
		
		
		//국어 점수 입력
		System.out.print("국어점수는? ");
		int kor = sc.nextInt();
		
		//영어 점수 입력
		System.out.print("영어점수는? ");
		int eng = sc.nextInt();
		
		//수학 점수 입력
		System.out.print("수학점수는? ");
		int math = sc.nextInt();

		System.out.println("[TEST] 점수들 : " + kor + "," + eng + "," + math);
		
		
		//총점 구하기
		int total = kor + eng + math;
		
		//평균 구하기
		double avg = total / (double)SUBJECT;
		
		System.out.println("[TEST] total: " + total + ", avg: " + avg);
	
		
		//--- 최종 출력 --------------------------------------------------
		
		System.out.println("--- 출력 ---");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(total + "\t");
		
//		System.out.println(avg); //평균
		System.out.printf("%.2f", avg); //avg값을 소수점 둘째자리까지만 출력함
		System.out.println();
		
//		System.out.print(name + "\t"
//				+ age + "\t"
//				+ gender + "\t"
//				+ kor + "\t"
//				+ eng + "\t"
//				+ math + "\t"
//				+ total + "\t");
//		System.out.printf("%.2f", avg); //avg값을 소수점 둘째자리까지만 출력함
//		System.out.println();
		
	}
}

















