// https://www.codechef.com/problems/FLOW008
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    String res = n<10 ? "Thanks for helping Chef!" : "-1";
		    System.out.println(res);
		}
	}
}
