public class Hello {

// Property or field

	static String name = "Prithvin";
	static int age = 32;

	void details() {
		System.out.println(name + " " + age);

	}
//==================

	public static void main(String[] args) {
		int num = 5;

		Hello.age = 31;

		Hello h = new Hello();

		h.details();

	}

}
