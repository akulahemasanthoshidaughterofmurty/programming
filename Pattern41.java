import java.util.*;
public class Pattern41{
	public static void main(String[] args) {
	int n = 5; // 5 rows
	
	for(int i=1; i <= n ; i++)// 5 rows
	{
		for(int j= n-1; j >= i ; j--)// j=4 	>= 2 	
			System.out.print(" "); // 4,3,2,1,0 - > spaces
		
		for(int k=1; k <= i; k++) // repeating
			System.out.print(i); // 1,2,3,4,5 -> *
		
		System.out.println();			
	}
}
/*
           1
        22
     333
  4444
55555
 */





}