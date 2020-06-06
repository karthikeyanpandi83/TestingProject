package JavaCollections.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List AL = new ArrayList();
		AL.add(20);
		AL.add(5);
		AL.add(2000);
		AL.add(-1);
		AL.add(0);
		//AL.add("Karthik"); // Duplicates are allowed in List.
		AL.add(1000);
		AL.add(20);
		//AL.add(null);
		//AL.add("Karthik"); // Duplicates are allowed in List.
		
		System.out.println(AL);
		//Arrays.sort(AL);
		Collections.sort(AL); 
		
		System.out.println("After sorting" + AL);
		
	}

}
