package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 13;
		boolean isPrime= true;
		for (int i=2; i<=num/2; i++) {
			if(num%i==0) {
				isPrime= false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+ " is a prime number");
		}else {
			System.out.println(num+ " is not a prime number");
		}

	}

}
