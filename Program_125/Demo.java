import Marvellous.MarvellousArray;
import java.lang.*;
import java.util.*;

public class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter size");

		int size = sobj.nextInt();

		MarvellousArray mobj = new MarvellousArray(size); 

		mobj.Accept();
		mobj.Display();
	}
}