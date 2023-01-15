
public class human {
	String hand;
	String leg;
	String eyes;
	String nose;
	String skin;
	{
		hand = "two hands";
	}
	void useofhand() {
		System.out.println("Humans can work with " + hand);
		System.out.println("Humans can slap with " + hand);
	}
	public static void main(String[] args) {
		
		human h = new human();
		h.useofhand();
	}

}
