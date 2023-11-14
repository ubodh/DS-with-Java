package help;

import java.util.Scanner;

public class Bob_and_his_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q-->0) {
			String s=sc.nextLine();
			int max=Integer.MAX_VALUE;
			int count_freq[]=new int[26];
			for(int i=0;i<26;i++) {
				count_freq[i]=-1;
			}
			for(int i=0;i<s.length();i++) {
				int ind=s.charAt(i)-'a';
				if(count_freq[ind]==-1) {
					count_freq[ind]=i;
				}else {
					int dis=i-count_freq[ind];
					if(dis>max) {
						max=dis;
					}
				}
			}
			if(max==Integer.MIN_VALUE) {
				System.out.println(-1);
			}else {
				System.out.println(max-1);
			}
		}

	}

}



//import java.util.*;

//public class Main {

//	public static int bobWorking(String s) {
//		int maxAns = 0;

//		int charArr[] = new int[26];
//		for (int i = 0; i < charArr.length; i++) {
//			charArr[i] = -1;
//		}
//		for(int i=0; i<s.length(); i++) {
//			if (charArr[s.charAt(i) - 'a'] == -1) {
//				charArr[s.charAt(i) - 'a'] = i;
//			} else {
//				charArr[s.charAt(i) - 'a'] = i - charArr[s.charAt(i) - 'a'];
//				if (maxAns < charArr[s.charAt(i) - 'a']) {
//					maxAns = charArr[s.charAt(i) - 'a'];
//				}
//			}
//		}
		
//		return maxAns-1;
//	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		int tc = scn.nextInt();
//		while (tc > 0) {
//			String s = scn.next();
//			System.out.println(bobWorking(s));
//			tc--;
//		}
//	}

//}


//
//import java.util.Scanner;
//
//public class Main {
// 
// public static int sol(String s){
//     
//     if(s.length() == 1)
//         return -1;
//     
//     int [] x = new int[26];
//     int ascii = 97; //ASCII value of 'a'
//     int si = -1, ei = 0, count = 0;
//     boolean bool = false;
//     
//     for(int i=0; i<x.length; i++){
//         
//         for(int j=0; j<s.length(); j++){
//             
//             if(s.charAt(j) == (char)ascii){
//                 
//                 if(si == -1)
//                     si = j;
//                 else{
//                     ei = j;
//                     count = ei - si - 1;
//                     
//                     if(count == 0) //This is the case when string is aabbcc like that. Here 0 refres
//                         bool = true; //that no elements exists b/w two characters
//             
//                     if(count > x[i])
//                         x[i] = count;  
//                 }
//             }
//         }
//         
//         si = -1;
//         ei = 0;
//         count = 0;
//         ascii++;
//     }
//     
//     int max = Integer.MIN_VALUE;
//     
//     for(int i=0; i<x.length; i++){
//        max = Math.max(x[i], max); 
//     }
//     
//     if(max == 0 && bool == true) //For the above mentioned case i.e. aabbcc we should return 0
//         return 0;
//     else if(max == 0 && bool == false)//This is the case when string is like abcdefgh i.e. there is no second
//         return -1; //character to have a boundary and all charactres are repeated once. Hence we should return -1
//     else
//     	return max;
//     
// }
// 
//	public static void main(String[] args) {
//		/* Your class should be named Main.
//			* Read input as specified in the question.
//			* Print output as specified in the question.
//		*/
//
//		// Write your code here
//     Scanner s = new Scanner(System.in);
//     
//     int n = s.nextInt();
//     
//  	for(int i=0; i<n; i++){
//         String si = s.next();
//         System.out.println(sol(si));
//     }
//     
//	}
//
//}