package commandLineArgument;
// this is code run through command line
public class argumentType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(args[0]);//single element take input in java run through command line
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]);
		}
		//run through command line throuth
		//secont proggram
		int sum=0;
		for(int j=0;j<args.length;j++) {
			sum=sum+Integer.parseInt(args[j]);
		}
		System.out.print("sum is "+" ="+sum);

	}

}
