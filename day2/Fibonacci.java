package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8, firstNum=0, secNum=1;
		for (int i = 0; i < range; i++) {
			System.out.println(firstNum + ",");
			int sum=firstNum+secNum;
			firstNum=secNum;
			secNum= sum;
		}
	}

}
