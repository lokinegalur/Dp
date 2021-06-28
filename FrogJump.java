package practice;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
public class FrogJump{
	  static int[] dp;
	  static int F(int[] arr,int i){
	    if(dp[i]==-1){
	      if(i==1){
	        dp[i]=Math.abs(arr[i]-arr[0]);
	      }
	      else if(i==2){
	        int dir = Math.abs(arr[2]-arr[0]);
	        int indir = Math.abs(arr[2]-arr[1])+Math.abs(arr[1]-arr[0]);
	        dp[i]=Math.min(dir,indir);
	      }
	      else{
	        int prev1 = F(arr,i-1)+Math.abs(arr[i]-arr[i-1]);
	        int prev2 = F(arr,i-2)+Math.abs(arr[i]-arr[i-2]);
	        dp[i]=Math.min(prev1,prev2);
	      }
	    }
	    return dp[i];
	  }
	  public static void main(String args[]){
	    Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++)
	      arr[i]=in.nextInt();
	    dp=new int[n];
	    Arrays.fill(dp,-1);
	   	int minCost = F(arr,n-1);
	    System.out.println(minCost);
	  }
}
