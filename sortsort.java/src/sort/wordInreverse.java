package sort;

public class wordInreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            String s="subodh kumar mahto";
            String ss[]=s.split(" ");
           String word="";
           for(int i=0;i<ss.length;i++) {
        	   word=ss[i]+" "+word;
           }
           System.out.print(word);  
            
	}

}
