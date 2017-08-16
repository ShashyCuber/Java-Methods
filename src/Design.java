// Shashwat Sparsh
public class Design 
{
	public static void end()
	{
		System.out.println("(******)");
	}
	
	public static void face()
	{
		System.out.println(" oo oo  ");
		System.out.println("   ^    ");
		System.out.println("  ~~~   ");
	}
	
	public static void bracket()
	{
		System.out.println("<<<<>>>>");
	}
	
	public static void doubleface()
	{
		end();
		face();
		bracket();
		face();
	}
	
	public static void middle()
	{
		bracket();
		System.out.println("~!~!~!~!");
		bracket();
	}
	
	
	public static void main(String[] args)
	{
		doubleface();
		middle();
		doubleface();
		end();
	}
	
}
