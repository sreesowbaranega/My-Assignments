package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34343, t, rem, r=0;
		t= num;
		for(;num!=0; num/=10) {
			rem=num%10;
			r=r*10+rem;
			
		}
		
		if(t==r) {
			System.out.println("Palindrome number");}
		else
		
			{
				System.out.println("Not a palindrome number");
			}

	}

}
