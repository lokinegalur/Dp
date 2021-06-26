/*package whatever //do not write package name here */


import java.io.*;

import java.util.*;

class GFG {

    
    static int dp[];

    
   static int  m(int n){

        if(dp[n]==-1){
 
          int res;

           if(n==1)
 
            res=0;

           else{


               int x=Integer.MAX_VALUE,y=x,z;

               if(n%3==0) x=m(n/3);

               if(n%2==0) y=m(n/2);

               z=m(n-1);

               res = Math.min(x,Math.min(y,z))+1;

           }

           dp[n]=res;

        }

        return dp[n];

    }

    
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);

		int n=in.nextInt();

		dp=new int[n+1];

		Arrays.fill(dp,-1);
		int steps = m(n);

		//for(int x:dp) System.out.println(x+" ");

		System.out.println("Minimum number of steps to reach from "+n+" to 1 is :"+steps);

	}

}