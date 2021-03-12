package java01_variables;

public class VariablesEx_06 {
	public static void main(String[] args) {
		
		final int MAX;
		
		MAX = 100; //한번만 대입 가능
		//MAX = 200; //다시 대입 불가
		
		//관례적으로 이름있는 상수의 이름은 모두 대문자로 작성한다
		//일반 변수와 구분하기 위함\
		
		//상수명의 단어 구분은 _로 한다
		//	ex) final int MAX_PEOPLE_COUNT;
		
		//---------------------------------------
		
		//ex)	학생들의 성적을 구하는 프로그램
		//	전체 인원이 50명
		
		final int STUDENT_NUM = 50; //총인원
		
		double avg = 1000 / STUDENT_NUM; //평균
	}
}
