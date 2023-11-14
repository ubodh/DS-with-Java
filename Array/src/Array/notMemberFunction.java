package Array;/*
public  void print(int arr[]) {
	for(int i:arr) {
		System.out.print(i);
	}
}
*/
//java in not possible crate any  functon 
//which is not a member of any class(as we can do in c++)
class A{
public  void print(int arr[]) {
	for(int i:arr) {
		System.out.print(i);
	}
}
}
public class notMemberFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		A a=new A();
a.print(arr);
	}

}
