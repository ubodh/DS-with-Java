package recursion;

public class bubleSor {
 public static void sortArray(int arr[]) {
	 if(arr.length==0) 
		 return ;
	   int i=0;
	 for(;i<arr.length-1;i++) {
		 if(arr[i]>arr[i+1]) {//1 4 2 3,//1 2 3
			 int temp=arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
			
		 }
	
	 }
	 
	 //if(ct==0) return ;
		 int a[]=new int[arr.length-1];//1 2 3 //1 2
		 for(int j=0;j<arr.length-1;j++) {
			 a[j]=arr[j];
		 }
		
		 sortArray(a);
		// ArrayList<Integer>ar=new Ar
		 System.out.print(arr[arr.length-1]);
		 
	
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,1,5,2,7,3,5};
		sortArray(arr);
//		for(int i:arr) {
//			System.out.print(i);
//		}

	}

}
