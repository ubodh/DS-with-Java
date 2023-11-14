package sortsort;
public class bubbleSort1{
	
public static void bubbleSort(int arr[], int n)
    {
        if (n == 0)
            return;
         int count = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count = count+1;
            }
         if (count == 0)
           return;
        bubbleSort(arr, n-1);
    }
public static void main(String args[]) {
	int arr[]= {4,1,1,6,8,2};
	bubbleSort(arr,arr.length);
	for(int i:arr) {
		System.out.print(i);
	}
}	
}