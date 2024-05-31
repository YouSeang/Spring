package kr.soft.study;

public class Calculation {

	int FirstNum = 10;
	int SecondNum = 2;
	
	public int getFirstNum() {
		return FirstNum;
	}
	public void setFirstNum(int firstNum) {
		FirstNum = firstNum;
	}
	public int getSecondNum() {
		return SecondNum;
	}
	public void setSecondNum(int secondNum) {
		SecondNum = secondNum;
	}
	
	public void addition() {
		System.out.println("addition()");
		System.out.print("10 + 2 = ");
		System.out.println(FirstNum + SecondNum);
	}
	
	public void subtraction() {
		System.out.println("subtraction()");
		System.out.print("10 - 2 = ");
		System.out.println(FirstNum - SecondNum);
	}

	public void multiplication() {
		System.out.println("multiplication()");
		System.out.print("10 * 2 = ");
		System.out.println(FirstNum * SecondNum);
	}
	
	public void division() {
		System.out.println("division()");
		System.out.print("10 / 2 = ");
		System.out.println(FirstNum / SecondNum);
	}
	
	
}
