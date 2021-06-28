/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static int[] dp;
    
    static int MinToOneTab(int n){
        dp[1]=0;
        for(int i=2;i<=n;i++){
            int x=Integer.MAX_VALUE,y=x,z;
            if(i%2==0)
                x=dp[i/2];
            if(i%3==0)
                y=dp[i/3];
            z=dp[i-1];
            dp[i] = Math.min(x,Math.min(y,z))+1;
            System.out.println("min steps to "+i+" is "+dp[i]);
        }
        return dp[n];
    }
    
	public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	dp=new int[n+1];
	Arrays.fill(dp,-1);
	int min = tabMinToOne(n);
	System.out.println(min);
	}
}
