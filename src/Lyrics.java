// Shashwat Sparsh
public class Lyrics
{
	public static void endLine()
	{
		System.out.println("That lay in the house that Jack built.");
		System.out.println("");
	}
	public static void killRat()
	{
		System.out.println("That killed the rat,");
	}
	public static void worryCat()
	{
		System.out.println("That worried the cat,");
	}
	public static void tossDog()
	{
		System.out.println("That tossed the dog,");
	}
	public static void milkCow()
	{
		System.out.println("That milked the cow with the crumpled horn,");
	}
	public static void endCouplet()
	{
		System.out.println("That ate the malt");
		endLine();
	}
	public static void endTriplet()
	{
		killRat();
		endCouplet();
	}
	public static void endQuartet()
	{
		worryCat();
		endTriplet();
	}
	public static void endQuintent()
	{
		tossDog();
		endQuartet();
	}
	public static void endSextet()
	{
		milkCow();
		endQuintent();
	}
	public static void intro()
	{
		System.out.println("This is the house that Jack built.");
		System.out.println("");
	}
	public static void paragraph1()
	{
		System.out.println("This is the malt");
		endLine();
	}
	public static void paragraph2()
	{
		System.out.println("This is the rat,");
		endCouplet();
	}
	public static void paragraph3()
	{
		System.out.println("This is the cat,");
		endTriplet();
	}
	public static void paragraph4()
	{
		System.out.println("This is the dog,");
		endQuartet();
	}
	public static void paragraph5()
	{
		System.out.println("This is the cow with the crumpled horn,");
		endQuintent();
	}
	public static void paragraph6()
	{
		System.out.println("This is the maiden all forlorn,");
		endSextet();
	}
	public static void main(String[] args)
	{
		intro();
		paragraph1();
		paragraph2();
		paragraph3();
		paragraph4();
		paragraph5();
		paragraph6();
		
	}

}
