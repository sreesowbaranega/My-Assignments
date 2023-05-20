package week1.day1;

public class Student {
	public void details() {
		String studentName = "Sree Sowbaranega";
		int rollNumber = 12345;
		String collegeName = "Anna University";
		int markScored = 458;
		float cgpa = 76.33f;
		
		System.out.println(studentName+"\n"+rollNumber+"\n"+collegeName+"\n"+markScored+"\n"+cgpa);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student c = new Student();
		c. details();
	}

}
