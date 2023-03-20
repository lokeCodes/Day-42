// https://www.codechef.com/problems/REACHFAST
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
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int k = s.nextInt();
		    int dis = Math.abs(x-y);
		    if(dis%k==0){
		        System.out.println(dis/k);
		    }else{
		        System.out.println( (dis/k) + 1 );
		    }
		}
	}
}
