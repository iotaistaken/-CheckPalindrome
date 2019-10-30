package prac;

import java.util.Scanner;

public class Main
{
	protected static boolean check(String[] arr)
	{
		int a = 0;
		int b = arr.length-1;
		while (a<b )
		{
			if (!arr[a].compareTo(arr[b]))
			{
				return false;
			}
			a++;
			b--;
		}
		return true;
	}
	
	// Recursive solution easier to write but may become computationally expensive than the above iterative solution
	protected static boolean check(String[] arr)
	{
		if(arr.length()<2)
		{
			return true;
		}
		else
		{
			if(arr.charAt(0)!=arr.charAt(arr.length()-1))
			{
				return false;
			}
			else
			{
				return check(arr.substring(1,arr.length()-1))
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner jk = new Scanner(System.in);
		String[] io = jk.nextLine().split("");
		System.out.print(check(io));			
		jk.close();
		if (check(io))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
												
	}
}
