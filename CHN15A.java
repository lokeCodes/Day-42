// https://www.codechef.com/problems/CHN15A
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
		    int no_of_minions = s.nextInt();
		    int mutation_value = s.nextInt();
		    int count =0;
		    while(no_of_minions>0){
		        int initial_value = s.nextInt();
		        int res = initial_value + mutation_value;
		        if(res%7==0){
		            count++;
		        }
		        
		        --no_of_minions;
		    }
		    System.out.println(count);
		    
		}
	}
}
