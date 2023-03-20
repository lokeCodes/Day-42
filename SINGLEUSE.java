// https://www.codechef.com/problems/SINGLEUSE
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
		    int boss_health = s.nextInt();
		    int each_attack_damage = s.nextInt();
		    int special_attack_damage = s.nextInt();
		    int rem_hp_after_spl_attack = boss_health - special_attack_damage;
		    
		    int res = ( rem_hp_after_spl_attack%each_attack_damage==0 ) ? ((rem_hp_after_spl_attack/each_attack_damage)+1) : 
		        ((rem_hp_after_spl_attack/each_attack_damage) +2);
		        
		    System.out.println(res);
		}
	}
}
