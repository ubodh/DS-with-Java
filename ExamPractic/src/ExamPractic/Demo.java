package ExamPractic;
import java.util.ArrayList;
public class Demo {
//	public static int fun(int n,int dp[]) {
//		if(n==0 || n==1) return n;
//		 if(dp[n]!=-1) return dp[n];
//		dp[n]=fun(n-1,dp)+fun(n-2,dp);
//		return dp[n];
//	}
	public static int fun(int n,int dp[]) {
		
		 if(n==0 || n==1) return n;
		 
		 int ans,ans1;
		 if(dp[n-1]==-1) {
			 ans=fun(n-1,dp);
			 dp[n-1]=ans;
		 }else {
			 ans=dp[n-1];
		 }
		 if(dp[n-2]==-1) {
			 ans1=fun(n-2,dp);
			 dp[n-2]=ans1;
		 }else {
			 ans1=dp[n-2];
		 }
		 dp[n]=ans+ans1;
		 return dp[n];
		 
	}
	public static int minCostMemo(int arr[][],int i,int j,int dp[][]) {
		int m=arr.length;
		int n=arr[0].length;
		// special case
		  if(i==m-1 && j==n-1)
			  return arr[i][j];
		  
		  
		  //base case
		  if(i>=m || j>=n) {
			  return Integer.MAX_VALUE;
		  }
		  
		  int ans1,ans2,ans3;
		   if(dp[i+1][j]==Integer.MIN_VALUE) {
		    ans1=minCost(arr, i+1, j);
		    dp[i+1][j]=ans1;
		   }else {
			   ans1=dp[i+1][j];
		   }
		   if(dp[i][j+1]==Integer.MIN_VALUE) {
		   ans2=minCost(arr, i, j+1);
		   dp[i][j+1]=ans2;
		   
		   }else {
			   ans2=dp[i][j];
		   }
		    if(dp[i+1][j+1]==Integer.MIN_VALUE) {
		   ans3=minCost(arr, i+1, j+1);
		   dp[i+1][j+1]=ans3;
		    }else {
		    	ans3=dp[i+1][j+1];
		    }
		  
		  dp[i][j]= arr[i][j]+Math.min(ans1, Math.min(ans2, ans3));
		  return dp[i][j];
	}
	public static int minCost(int arr[][],int i,int j) {
		int m=arr.length;
		int n=arr[0].length;
		// special case
		  if(i==m-1 && j==n-1)
			  return arr[i][j];
		  
		  
		  //base case
		  if(i>=m || j>=n) {
			  return Integer.MAX_VALUE;
		  }
		  
		  
		  int ans1=minCost(arr, i+1, j);
		  int ans2=minCost(arr, i, j+1);
		  int ans3=minCost(arr, i+1, j+1);
		  
		  int myAns= arr[i][j]+Math.min(ans1, Math.min(ans2, ans3));
		  return myAns;
	}

	public static void main(String[] args) {
//		ArrayList<ArrayList<Long>>ans = new ArrayList<ArrayList<Long>>();
//		ArrayList<Long>ans1=new ArrayList<>();
//		for(int i=0;i<5;i++) {
//			ans1.add((long) i);
//		}
//		ans.add(ans1);
//		for(Long i:ans1) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		ArrayList<Long>arr = new  ArrayList<Long>();
//		arr.add((long) 1);
//		ans.add(arr);
//		ArrayList<Long>arr1=new  ArrayList<Long>();;
//		arr1.add((long) 1);
//		arr1.add((long) 1);
//		ans.add(arr1);
//		
//		for(ArrayList<Long>an:ans) {
//			for(Long i:an) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		int arr[][]= {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
		int dp[][]=new int[arr.length+1][arr[0].length+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-Integer.MIN_VALUE;
			}
		}
		int ans=minCost(arr, 0, 0);
		System.out.println("minCost"+ans);
		int ans1=minCostMemo(arr, 0, 0,dp);
		System.out.println("minCostMemo ="+ans1);
		
		System.out.println();
		
		
		int dp1[]=new int[6];
		
		for(int i=0;i<6;i++) {
			dp1[i]=-1;
		}
		System.out.print(fun(5,dp1));
		
	}
}
