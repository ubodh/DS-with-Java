package recursion;

public class recursion {
	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);
	    System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(3);

	}

}
