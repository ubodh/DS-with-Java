package SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<String>();
		  
        // Elements are added using add() method
        // Later onwards we will show accessing the same
  
        // Custom input elements
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("A");
  
        // Print the Set object elements
        System.out.println("Set is " + hs);
  
        // Declaring a string
        String check = "D";
        // remove the element 
        hs.remove("B");
        System.out.println("Set is " + hs);
  
        // Check if the above string exists in
        // the SortedSet or not
        // using contains() method
        System.out.println("Contains " + check + " "
                           + hs.contains(check));
        for (String value : hs)
        	  
            // Printing all the values inside the object 
            System.out.print(value + ", ");
          
        System.out.println();
     // Iterating through iterators
        Iterator<String> i = hs.iterator();
  
        // It holds true till there is a single element
        // remaining in the object
        while (i.hasNext())
  
            System.out.println(i.next());

	}

}
