package Recursion3;

public class KeyPadCode {
	
	public static String getOptios(int digit) {
		if(digit==2) {
			return "abc";
		}
		else if(digit==3) {
			return "def";
		}
		else if(digit==4) {
			return "ghi";
		}
		else if(digit==5) {
			return "jkl";
		}
		else if(digit==6) {
			return "mno";
		}
		else if(digit==7) {
			return "pqrs";
		}
		else if(digit==8) {
			return "tuv";
		}
		else if(digit==9)
		return "wxyz";
		else
		return null;
	}
	public static String [] keypadCombination(int input) {
		
	if(input==0) {
		String []output= {" "};
		return output;
	}
	String []smallOutput=keypadCombination(input/10);
	int lastDigit=input%10;
	String lastDigitOptions= getOptios(lastDigit);
	String output[]=new String[smallOutput.length*lastDigitOptions.length()];
	int k=0;
	
	for(int i=0;i<smallOutput.length;i++) {
	for(int j=0;j<lastDigitOptions.length();j++) {

		output[k]=smallOutput[i]+lastDigitOptions.charAt(0);
		k++;
	}
	}
	return output;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String arr[]=	keypadCombination(23);
for(String a:arr) {
	System.out.println(a);
}
	}

}
