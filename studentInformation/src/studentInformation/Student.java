package studentInformation;

import java.util.Scanner;

class detail{
    String name;
    int roolNumber;
    String branch;
    int passOut;
    detail(String name,int roolNumber,String branch,int passout){
        this.name=name;
        this.roolNumber=roolNumber;
        this.branch=branch;
        this.passOut=passout;
    }
}

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine(); // consume the newline character
        detail arr[]=new detail[n];
        for(int i=0;i<n;i++) {
            String name=sc.nextLine();
            int roolNumber=sc.nextInt();
            sc.nextLine(); // consume the newline character
            String branch=sc.nextLine();
            int passOut=sc.nextInt();
          sc.nextLine(); // consume the newline character
            detail ob= new detail(name,roolNumber,branch,passOut);
            arr[i]=ob;
        }
        for(int i=0;i<n;i++) {
            System.out.println(arr[i].name+" "+arr[i].roolNumber+ " "+arr[i].branch+" "+arr[i].passOut);
        }
        System.out.println();
    }

}
