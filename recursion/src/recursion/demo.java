package recursion;

public class demo {
//            public static void printt(int arr[]) {
//            	//selection sort 
//            	int n=arr.length;
//            	for(int i=0;i<n-1;i++) {
//            		for(int j=i+1;j<n;j++) {
//            			if(arr[i]>arr[j]) {
//            				int temp=arr[i];
//                    		arr[i]=arr[j];
//                    		arr[j]=temp;
//            			}
//            		}
//            		
//            	}
//            	
//            			
//            }
//            public static void printt1(int arr[]) {
//            	// bubble sort
//            	int n=arr.length;
//            	for(int i=0;i<n-1;i++) {
//            		for(int j=0;j<n-1-i;j++) {
//            			if(arr[j]>arr[j+1]) {
//            				int temp=arr[j];
//            				arr[j]=arr[j+1];
//            				arr[j+1]=temp;
//            			}
//            		}
//            	}
//            }
            public static void mergeSort(int arr3[],int arr1[],int arr2[]) {
            	int n1=arr1.length;
            	int n2=arr2.length;
            	int i=0;
            	int j=0;
            	int k=0;
            	while(i<n2 && j<n2) {
            		if(arr1[i]<arr2[j]) {
            			arr3[k]=arr1[i];
            			k++;i++;
            		}else {
            			arr3[k]=arr2[j];
            			k++;j++;
            		}
            	}
            	while(i<n1) {
            		arr3[k]=arr1[i];
            		i++;k++;
            	}
            	while(j<n2) {
            		arr3[k]=arr2[j];
            		k++;j++;
            	}
            	
            	
            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,5,1};
		int arr1[]= {4,5,9,0,1};
		int m=arr.length+arr1.length;
		int arr3[]=new int[m];
		//printt1(arr);
		mergeSort(arr3,arr,arr1);
		for(int i:arr) {
			System.out.print(i);
		}
		System.out.println();
		for(int i:arr3) {
			System.out.print(i);
		}

	}

}
