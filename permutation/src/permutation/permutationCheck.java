package permutation;


	import java.util.* ;
	import java.io.*; 
	import java.util.Scanner;
	class permutationCheck {
		
	    static boolean isPermutation(String input1,String input2) {

	        // Write your code here
	        if(input1.length()!=input2.length()) return false;

	         char []arr1 = input1.toCharArray();
	        Arrays.sort(arr1);
	         char []arr2 = input2.toCharArray();
	        Arrays.sort(arr2);
	        for(int i=0;i<input2.length();i++){
	           
	                 if(arr1[i]!=arr2[i])
	                 return false;
	            }
	        
	        return true;

	    }
	    
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
	        String input1 = sc.nextLine();
	        String input2 = sc.nextLine();
	        boolean answer = isPermutation(input1,input2);
	        if(answer){
	            System.out.println("true");
	        }
	        else{
	            System.out.println("false");
	        }

		}
	}

