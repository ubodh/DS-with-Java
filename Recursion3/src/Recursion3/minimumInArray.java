package Recursion3;
public class minimumInArray {

	public static int findMin(int arr[],int startIndex) {
		if(startIndex==arr.length) {
			return Integer.MAX_VALUE;
		}
		int minSmallArray =findMin(arr,startIndex+1);
		if(arr[startIndex]<minSmallArray){
			return arr[startIndex];
		}else {
			return minSmallArray;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,1,45,6,8,1,111,2};
		int min=findMin(arr,0);
		System.out.println(min);
		findMin1(arr);
		printMin(arr,0,Integer.MAX_VALUE);
		printSubseqences("abc");

	}

	private static void printMin(int[] arr, int startIndex, int minSoFar){
		// TODO Auto-generated method stub
		if(arr.length==startIndex) {
			System.out.print(minSoFar);
			return ;
		}
		int newMin=minSoFar;
		if(arr[newMin]<minSoFar) {
			newMin=arr[startIndex];
		}
		printMin(arr, startIndex+1, newMin);
	}

	private static void findMin1(int[] arr) {
		// TODO Auto-generated method stub
		int min=findMin(arr,0);
		System.out.println(min);
		
	}
	public static void printSubseqences(String str,String stringSoFar) {
		if(str.length()==0) {
			System.out.println(stringSoFar);
		}
		String smallInput=str.substring(1);
		printSubseqences(smallInput,stringSoFar);
		printSubseqences(smallInput,stringSoFar+str.charAt(0));
		
		
	}
public static void pritnKeyPadCombination(int input,Stirng stringSoFar) {\
	if(input==0) {
		System.out.println(stringSoFar);
		return ;
	}
int lastDigit=input%10;
int smallInput=input/10;
String optionLastDigit=getOption1(lastDigit);
for(int i=0;i<optionLastDigit.length();i++) {
	pritnKeyPadCombination(smallInput,optionLastDigit.charAt(i)+stringSoFar);
}
}
public static String getOption1(int digit) {
	if(digit==2) {
		return "abc";
	}
	if(digit==3) {
		return "def";
	}
	if(digit==3) {
		return "ghi";
	}
	if(digit==4) {
		return "pqrs";
	}
	if(digit==5) {
		return "tuv";
	}
	if(digit==6) {
		return "wxy";
	}
	if(digit==7) {
		return "z";
	}
	return null;	
}
}
