package Class3_Collections_Topic1_to_Last;


import java.util.ArrayList;

public class Class3_topic02_CollectionFramework {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        	list.add(40);							
        	// Print each element	
        	System.out.println(list.get(0));
        		
        	System.out.println(list.get(1));
        	System.out.println(list.get(2));
        	System.out.println(list.get(3));
        	
        	//for loop to print all elements
        	for (int i = 0; i < list.size(); i++) {
        			System.out.println(list.get(i));
        							
        	}
        	
        	//for each loop to print all elements
        	for (Integer num : list) {
				System.out.println(num);
			}
        		
    }
}
