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
