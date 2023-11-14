package dublicateNumber;

public class cpp {

	public static void main(String[] args) {
//		1
//		7
//		2 3 1 6 3 6 2//find unic number;
	int a[]= {2,3,1,6,3,6,2};
	int ans;
	for(int i=0;i<a.length;i++) {
		ans=0;
		for(int j=0;j<a.length;j++) {
			if(i==j)
				continue;else {
			if(a[i]==a[j])
				  ans+=1;}
		}
		if(ans==0)
			System.out.print(a[i]);
	}

	}

}
