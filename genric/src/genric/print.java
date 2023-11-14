package genric;


public class print {
	public static<T extends printInterface> void printArray(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].print();
			//System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer arr[]=new Integer[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i+1;
//		}
//		printArray(arr);
//		String arrs[]=new String[5];
//		for(int i=0;i<arrs.length;i++) {
//			arrs[i]="aba";
//		}
//		printArray(arrs);
//		
//		Vehicle v[]=new Vehicle[5];
//		for(int i=0;i<v.length;i++) {
//			v[i]=new Vehicle(10*i,"ab");
//		}
//		printArray(v);
		Student st[]=new Student[5];
		for(int i=0;i<st.length;i++) {
			st[i]=new Student(10*i+1);
		}
		printArray(st);
	}
	}
