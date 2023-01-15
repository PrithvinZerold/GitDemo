
public class student {

	String name;
	int age;
	int rollno;
	{
	
	name = "Raju";
	age = 02;
	rollno = 03;
	
	}

	void info() {
		System.out.println(name + " = 10 " + age + " " + rollno);
	}

	public static void main(String[] args) {

		student s = new student();
		s.info();
	}

}
