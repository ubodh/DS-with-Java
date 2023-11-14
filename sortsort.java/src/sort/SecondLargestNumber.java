package sort;

public class SecondLargestNumber {
public static int secondLargestElement(int[] arr) {
//	//Your code goes here
//    int n=arr.length;
//     if(n<=1)
//     return -2147483648;
//     for(int i=0;i<n-1;i++){
//         for(int j=0;j<n-1-i;j++){
//             if(arr[j]<arr[j+1])
//             {
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//             }
//         }
//     } 
//    
//     return arr[1]==arr[n-1]?-2147483648
//:arr[1];
	int n=arr.length;
         int f=Integer.MIN_VALUE;
         int s=Integer.MIN_VALUE;
         int i=0;
         f=f>arr[i]?arr[i]:f;
         i++;
         while(i<n){
             if(arr[i]>f){
             f=arr[i];
             }
             if(arr[i]>s &&s!=arr[i]){
             s=arr[i];
             }
             i++;
         }
         return s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,7,6,8,4,5,2,3};
		int x= secondLargestElement(arr);
		System.out.print(x);

	}

}
