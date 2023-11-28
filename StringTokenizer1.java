import java.util.*;
public class StringTokenizer1 
{
	public static void main(String[] args) 
	{
		String bt = "4*3+(4-2)/4";
		StringTokenizer st1 = new StringTokenizer(bt,"*+/-() ");
		System.out.println("\n\tBieu thuc toan bt = "+bt + " gom cac toan hang: ");
		while (st1.hasMoreTokens())
			System.out.println("\t\t" + st1.nextToken());
			String day = "Ha Noi, ngay: 12/05/2011";
		StringTokenizer st2 = new StringTokenizer(day,",:/",true);
		System.out.println("\t" + day + "co cac token: ");
		while (st2.hasMoreTokens())
			System.out.println("\t\t" + st2.nextToken());
		

	}
}