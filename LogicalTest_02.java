package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {
		int a=5, b=6, c=10;

		boolean res1;
		res1 = a<b || --a>c++; 
		System.out.println("a="+a+",b="+b+",c="+c);

		boolean res2;
		res2 = c<b++ && c-->++a; 
		System.out.println("a="+a+",b="+b+",c="+c);

	}
}






