package sort;
public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,6,1,2};
		int arr2[]= {1,2,3,4,2};
		int n1=arr1.length;
		int n2=arr2.length;
		int n3=n1>n2?n1:n2;
		int arr3[]=new int[n3];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(arr1[i]==arr2[j]) {
				   arr3[i]=arr1[i];
				   arr2[j]=-1;
				    break;
				}
			}
		}
		for(int i=0;i<n3-1;i++) {
			for(int j=0;j<n3-1-i;j++) {
				if(arr3[j]>arr3[j+1]) {
					int temp=arr3[j];
					arr3[j]=arr3[j+1];
					arr3[j+1]=temp;
				}
			}
		}
		for(int i:arr3) {
			if(i==0)
				continue;
			else
			System.out.print(i);
		}

	}

}
