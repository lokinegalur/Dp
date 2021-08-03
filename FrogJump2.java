import java.util.*;
import java.lang.*;


public class FrogJump2{
  static int[] dp;
	
public static int minc(int[] h,int k,int index){        
  if(dp[index]!=-1)
    return dp[index];
  int min_cost=Integer.MAX_VALUE;
  for(int i=1;i<=Math.min(k,index);i++){
    min_cost=Math.min(min_cost,minc(h,k,index-i)+Math.abs(h[index]-h[index-i]));
  }
  dp[index]=min_cost;
  return dp[index];
}
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int h[]=new int [n];
    for(int i=0;i<n;i++)
      h[i]=in.nextInt();
    dp=new int[n];
    Arrays.fill(dp,-1);
    dp[0]=0;
    dp[1]=Math.abs(h[1]-h[0]);
    int res=minc(h,k,n-1);
    System.out.println(res);
  }
}
