import java.util.*;
/*
EEEEE
 DDDD
     CCC
       BB
        A
*/

package Patterns;
public class Pattern52{
	public static void main(String[] args) {
		int n = 5; // 5 rows
		
		for(int i=n; i >= 1 ; i--)// i = 5, 4,3 rows
		{
			for(int j= n-1; j >= i ; j--)// j=4 >= 3	
				System.out.print(" "); // 0,1,2 -> spaces
			
			for(int k=1; k <= i; k++) // k=1 <= 3 ->t 
				System.out.print((char)(i+64)); // 5,4,3  -> *
			
			System.out.println();			
		}
}}
