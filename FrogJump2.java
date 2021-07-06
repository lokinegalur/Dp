/*package whatever //do not write package name here */

import java.lang.Math;
import java.util.Scanner;
import java.io.*;
class FrogJump2 {
    static int[] dp;    
    static int mc(int[] arr,int k,int stone){
        if(dp[stone]==0){
            int res;
            
        if(stone==0)
            res= 0;
            
        else if(stone==1)
            res= Math.abs(arr[1]-arr[0]);
            
        else{
        int cost=Integer.MAX_VALUE;
        int start=0;
        if(stone>=k)
            start=stone-k;
        for(int i=start;i<stone;i++)
                cost=Math.min(cost,mc(arr,k,i)+Math.abs(arr[stone]-arr[i]));
          res=cost;
            }
           
        dp[stone]=res;
        }
        return dp[stone];
    }
	public static void main (String[] args) {
	    InputStreamReader is = new InputStreamReader(System.in);
	    BufferedReader buff = new BufferedReader(is);
	    String input[]=buff.readLine().split();
	    int n=Integer.parseInt(input[0]);
	    int k=Integer.parseInt(input[1]);
		int arr[]=new int[n];
		input=buff.readLine().split();
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(input[i]);
		dp=new int[n];
		int minCost=mc(arr,k,n-1);
		System.out.println(minCost);
	}
}
