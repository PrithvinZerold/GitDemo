
public class car {

	String Brand;
	int Year;
	int Top_Speed;
	{
		Brand = "BMW";
		Year = 2021;
		Top_Speed = 310;
	}

	public void getdetails() {
		System.out.println("The Brand new " + Brand + " made in " + Year + " have Top Speed " + Top_Speed);
	}

	public static void main(String[] args) {

		car details = new car();
		details.getdetails();

		System.out.println("Hello World");

	}
}
