import java.io.*;
import java.util.*;
public class LCSPrint {
    static void lcs(String s1,String s2,int m,int n){
       int[][] dp=new int[m+1][n+1];
       for(int i=1;i<=m;i++){
           for(int j=1;j<=n;j++){
               if(s1.charAt(i-1)==s2.charAt(j-1)){
                   dp[i][j]=1+dp[i-1][j-1];
               }
               else{
                   dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
               }
               
           }
          
       }
       int i=m,j=n;
       int index=dp[m][n];
       char[] arr=new char[dp[m][n]+1];
       arr[dp[m][n]]='\u0000';
       while(i>0 && j>0){
           if(s1.charAt(i-1)==s2.charAt(j-1)){
               arr[index-1]=s1.charAt(i-1);
               i--;
               j--;
               index--;
           }
           else if(dp[i-1][j]<dp[i][j-1])
                    j--;
           else
                    i--;
       }
       System.out.println(arr);
    }
    
	public static void main (String[] args) {
		 String s1="abcde",s2="abkhkjhjcde";
		 lcs(s1,s2,s1.length(),s2.length());
	}
}
