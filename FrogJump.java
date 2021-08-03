import java.util.*;
import java.lang.*;
public class FrogJump{
  static int[] dp;
  
  static int minC(int[] h,int index){
    if(dp[index]!=-1)
      return dp[index];
    int p=minC(h,index-1)+Math.abs(h[index]-h[index-1]);
    int v=minC(h,index-2)+Math.abs(h[index]-h[index-2]);
    dp[index]=Math.min(p,v);
    return dp[index];
  }
  
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    dp=new int[n];
    int h[]=new int[n];
    for(int i=0;i<n;i++)
      h[i]=in.nextInt();
    Arrays.fill(dp,-1);
    dp[0]=0;
    dp[1]=Math.abs(h[1]-h[0]);
    int ans=minC(h,n-1);
    System.out.println(ans);
  }
  
}
