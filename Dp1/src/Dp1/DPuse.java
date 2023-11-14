package Dp1;

class Solution {

public static int minCostPath(int[][] input) {
    return findMinCost(input, 0, 0);
}

private static int findMinCost(int[][] input, int row, int col) {
    // base case
    if (row == input.length - 1 && col == input[0].length - 1) {
        return input[row][col];
    }
    
    // recursive cases
    int rightCost = Integer.MAX_VALUE;
    int downCost = Integer.MAX_VALUE;
    int diagonalCost = Integer.MAX_VALUE;
    
    if (col < input[0].length - 1) {
        rightCost = findMinCost(input, row, col + 1);
    }
    
    if (row < input.length - 1) {
        downCost = findMinCost(input, row + 1, col);
    }
    
    if (row < input.length - 1 && col < input[0].length - 1) {
        diagonalCost = findMinCost(input, row + 1, col + 1);
    }
    
    return input[row][col] + Math.min(rightCost, Math.min(downCost, diagonalCost));
}

}
public class DPuse {
	public static int knapsackI(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here
		// n=values.length; like that
		   int[][] dp = new int[n+1][maxWeight+1];
        
		   for(int i=n-1;i>=n;i--) {
			   for(int w=0;w<=maxWeight;w++) {
				   int ans;
				   if(weights[i-1] > w) {
					   int ans1=values[i]+dp[i+1][w-weights[i]];
					   int ans2=dp[i+1][w];
					   ans=Math.max(ans1, ans2);
				   }else {
					   ans=dp[i+1][w];
				   }
				   dp[0][w]=ans;
			   }
		   }
		   //return dp[n][maxWeight];
        // fill the table
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= maxWeight; w++) {
                if (weights[i-1] > w) {
                    // current item is too heavy to include
                    dp[i][w] = dp[i-1][w];
                } else {
                    // decide whether to include current item or not
                    dp[i][w] = Math.max(dp[i-1][w], values[i-1] + dp[i-1][w-weights[i-1]]);
                }
            }
        }
        
        return dp[n][maxWeight];
	}
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
//		if(weights.length==0 || maxWeight==0) {
//			return 0;
//		}
		if(n==values.length) 
			return 0;
		
		int ans;
		// include thr value;
		if(weights[n]<=maxWeight) {
		int ans1=knapsack(weights,values,n+1,maxWeight-weights[n])+values[n];
		 //exclude the value
		int ans2=knapsack(weights,values,n+1,maxWeight);
		ans=Math.max(ans1, ans2);
		//return Math.max(knapsack(weights,values,n-1,maxWeight), ans);
		}
		else {
			ans=knapsack(weights,values,n+1,maxWeight);
		}
		return ans;
	}

	public static int editDistanceR(String s, String t) {
	    int m = s.length();
	    int n = t.length();
	    
	    // Base case
	    if (m == 0) {
	        return n;
	    }
	    if (n == 0) {
	        return m;
	    }
	    
	    // Recursive calls
	    if (s.charAt(m-1) == t.charAt(n-1)) {
	        return editDistanceR(s.substring(0, m-1), t.substring(0, n-1));
	    }
	    
	    int insertCost = editDistanceR(s, t.substring(0, n-1));
	    int deleteCost = editDistanceR(s.substring(0, m-1), t);
	    int replaceCost = editDistanceR(s.substring(0, m-1), t.substring(0, n-1));
	    
	    return 1 + Math.min(insertCost, Math.min(deleteCost, replaceCost));
	}
	public static int editDistanceI(String s, String t) {
		//Your code goes here
		 int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        
        // base case
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        
        // fill the table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        
        return dp[m][n];
    }

	public static int lcsI(String str1,String str2) {
		int m=str1.length();
		int n=str2.length();
		int dp[][]= new int [m+1][n+1];
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				int ans;
				if(str1.charAt(i)==str2.charAt(j)) {
					ans=1+dp[i+1][j+1];
				}else {
					int ans1=dp[i][j+1];
					int ans2=dp[i+1][j];
					ans=Math.max(ans1, ans2)
				}
				dp[i][j]=ans;
			}
			return dp[0][0];
		}
	}
	public static int lcsdp(String str1,String str2,int i,int j,int dp[][]) {
		if(i==str1.length()|| j==str2.length()) {
			return 0;
		}
		int myAns = 0;
		if(str1.charAt(i)==str2.charAt(j)) {
			int smallAns;
			if(dp[i+1][j+1]==-1) {
				smallAns=LCS(str1,str2,i+1,j+1);
			dp[i+1][j+1]=smallAns;	
			}else {
				smallAns=dp[i+1][j+1];
			
			}
			myAns=1+smallAns;
		}else {
			
			int ans1,ans2;
			
			if(dp[i+1][j]==-1) {
				ans1=LCS(str1,str2,i+1,j);
				dp[i+1][j]=ans1;
			}
			else {
				ans1=dp[i+1][j];
			   }
			
			if(dp[i][j+1]==-1) {
				ans2=LCS(str1,str2,i,j+1);
			dp[i][j+1]=ans2;
			}else {
				ans2=dp[i][j+1];
			}
			myAns =Math.max(ans1, ans2);
		}
			return myAns;
	}
	public static int LCS(String str1,String str2,int i,int j) {
		if(i==str1.length()|| j==str2.length()) {
			return 0;
		}
		int myAns;
		if(str1.charAt(i)==str2.charAt(j)) {
			int smallAns=LCS(str1,str2,i+1,j+1);
			myAns=1+smallAns;
		}else {
			int ans1=LCS(str1,str2,i+1,j);
			int ans2=LCS(str1,str2,i,j+1);
			myAns=Math.max(ans1, ans2);
		}
		return myAns;
	}

public static int lcs(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] memo = new int[m + 1][n + 1];
        return lcsHelper(s, t, m, n, memo);
    }

    private static int lcsHelper(String s, String t, int m, int n, int[][] memo) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (memo[m][n] > 0) {
            return memo[m][n];
        }

        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            memo[m][n] = lcsHelper(s, t, m - 1, n - 1, memo) + 1;
        } else {
            memo[m][n] = Math.max(lcsHelper(s, t, m - 1, n, memo), lcsHelper(s, t, m, n - 1, memo));
        }

        return memo[m][n];
    }
	// top to bottom approch 
	public static int minCostII(int arr[][]) {
		 int m=arr.length;
		 int n=arr[0].length;
		 
		 int dp[][]=new int [m+1][n+1];
		 
		 for(int i=0;i<dp.length;i++) {
			 for(int j=0;j<dp[i].length;j++) {
				 dp[i][j]=Integer.MAX_VALUE;
			 }
		 }
		 for(int i=0;i<=m;i++) {
			 for(int j=0;j<=n;j++) {
				 if(i==1 && j==1) {
					 dp[i][j]=arr[0][0];
					continue;
				 }else {
				 int ans=dp[i][j-1];
				 int ans1=dp[i-1][j];
				 int ans2=dp[i-1][j-1];
				 dp[i][j]=arr[i-1][j-1]+Math.max(ans,Math.max(ans1, ans2));
			 }
			 }
		 }
		 return dp[m][n];
	 }
 public static int minCostI(int arr[][]) {
	 int m=arr.length;
	 int n=arr[0].length;
	 
	 int dp[][]=new int [m+1][n+1];
	 
	 for(int i=0;i<dp.length;i++) {
		 for(int j=0;j<dp[i].length;j++) {
			 dp[i][j]=Integer.MAX_VALUE;
		 }
	 }// botom to top approch 
	 for(int i=m-1;i>=0;i--) {
		 for(int j=n-1;j>=0;j--) {
			 if(i==m-1 && j==n-1) {
				 dp[i][j]=arr[i][j];
				 continue;
			 }
			 int ans=dp[i][j+1];
			 int ans1=dp[i+1][j];
			 int ans2=dp[i+1][j+1];
			 dp[i][j]=arr[i][j]+Math.max(ans,Math.max(ans1, ans2));
		 }
	 }
	 return dp[0][0];
 }
	public static int  minCostDp(int arr[][],int dp[][],int i,int j) {
		int m=arr.length;
		int n=arr[0].length;
		
		if(i==m-1 && j==n-1) {
			return arr[i][j];
		}
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		
		int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3 = Integer.MAX_VALUE;
		
		if(dp[i+1][j]==Integer.MIN_VALUE) {
			ans1=minCostDp(arr,dp,i+1,j);
			dp[i+1][j]=ans1;
		}else
		{
			ans1=dp[i+1][j];
		}
		
		if(dp[i][j+1]==Integer.MIN_VALUE) {
			ans2=minCostDp(arr,dp,i+1,j);
			dp[i][j+1]=ans2;
		}else
		{
			ans2=dp[i][j+1];
		}
		if(dp[i+1][j+1]==Integer.MIN_VALUE) {
			ans3=minCostDp(arr,dp,i+1,j);
			dp[i+1][j+1]=ans3;
		}else
		{
			ans3=dp[i+1][j+1];
		}
	//dp[i][j]=
		int myAns=arr[i][j] + Math.min(ans1, Math.min(ans2, ans3));
	dp[i][j]=myAns;
	return dp[i][j];
	
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution obj=new Solution();
		
		int arr[][]= {{3 ,4 ,1 ,2},
				{2 ,1, 8, 9},
				{4 ,7 ,8 ,1}};
		int dp[][]=new int[arr.length+1][arr[0].length+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;//Integer.MIN_VALUE;
			}
		}
		int values[]= {200,300,100};
		int weights[]= {20,25,30};
		int maxWeight=50;
		int ansK=knapsack(values,weights,maxWeight,0);
		System.out.println(ansK);
		
		String str1="bedgmc";
		String str2="abdfglc";
		int lc_s=lcsI(str1,str2);
		System.out.println(lc_s);
		int asn=LCS(str1,str2,0,0);
		System.out.println(asn);
		int anss=minCostDp(arr,dp,0,0);
		System.out.println(anss);
		int ans=minCost(arr,0,0);
		System.out.println(ans);

		int ans1=obj.minCostPath(arr);
		System.out.println(ans1);
		int ansI=minCostI(arr);
		System.out.println(ansI);
		int ansII=minCostII(arr);
		System.out.println("top to bottom approch"+ansII);


	}

	private static int minCost(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		int m=arr.length;
		int n=arr[0].length;
		// special case
		if(i==m-1  && j==n-1) {
			return arr[i][j];
		}
        // base casse 
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		
		int min1=minCost(arr,i+1,j);
		int min2=minCost(arr,i,j+1);
		int min3=minCost(arr,i+1,j+1);
		
		return arr[i][j]+Math.min(min1,Math.min(min2, min3));
	}

}
