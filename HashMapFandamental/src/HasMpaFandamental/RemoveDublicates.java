package HasMpaFandamental;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDublicates {
	
//	 public static int maxFrequencyNumber(int[] arr){ 
//			/* Your class should be named Solution
//			 * Don't write main().
//			 * Don't read input, it is passed as function argument.
//			 * Return output and don't print it.
//		 	 * Taking input and printing output is handled automatically.
//			*/
//			HashMap<Integer,Integer>map=new HashMap<>();
//			for(int i=0;i<arr.length;i++){
//				map.put(arr[i],1);
//			}
//	    }
	
public static  ArrayList<Integer> removeDublicate(int arr[]){
	ArrayList<Integer> output=new ArrayList<>();
	HashMap<Integer,Boolean>map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			continue;
		}
		output.add(arr[i]);
		map.put(arr[i],true);
	}
	return output;
}
static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,3,2,2,3,1,6,2,5};
        
        //ArrayList<Integer>output=removeDublicate(arr);
       // System.out.println(output);
        System.out.println(arr);
	}

}
