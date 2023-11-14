package sort;

public class mergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int arr1[]= {1,4,6,10,13};
                int arr2[]= {2,5,7,9};
                int n1=arr1.length;
                int n2=arr2.length;
                int arr3[]=new int[n1+n2];
                int i=0,j=0,k=0;
                while(i<n1 &&j<n2) {
                	if(arr1[i]<arr2[j])
                	{
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
                	j++;k++;
                }
                for(int i1=0;i1<arr3.length;i1++) {
        			System.out.print(arr3[i1]);
                }
	}

}
