// https://www.codechef.com/problems/SALE
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
		    int z = s.nextInt();
		    
		    int minimum = Math.min(x,Math.min(y,z));
		    System.out.println(x+y+z-minimum);
		    
		  //  if(x>=y && x>=z){
		  //      if(y>z){
		  //          System.out.println(x+y);
		  //      }else{
		  //          System.out.println(x+z);
		  //      }
		  //  }else if(y>=x && y>=z){
		  //      if(x>z){
		  //          System.out.println(y+x);
		  //      }else{
		  //          System.out.println(y+z);
		  //      }
		  //  }else{
		  //      if(x>y){
		  //          System.out.println(z+x);
		  //      }else{
		  //          System.out.println(z+y);
		  //      }
		  //  }
		  
		}
	}
}
