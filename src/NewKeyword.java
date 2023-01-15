public class NewKeyword {
	String a = "Hello World";

	public static void main(String[] args)
	{
		try
		{
			Class b = Class.forName("NewKeyword");
			NewKeyword c = (NewKeyword) b.newInstance();
			System.out.println(c.a);
		}
		catch(ClassNotFoundException e)
		{
		e.printStackTrace();
	    }
        catch(InstantiationException e)
        {
	    e.printStackTrace();
}
		catch (IllegalAccessException e) 
		{
		e.printStackTrace(); 
		}
		}
}