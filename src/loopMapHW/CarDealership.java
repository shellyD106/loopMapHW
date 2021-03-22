package loopMapHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CarDealership {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> vehicles = new HashMap<String, ArrayList<Integer>>();

        
        vehicles.put("Rav4", new ArrayList<Integer>(Arrays.asList(2003, 2010, 2017)));
        vehicles.put("Pruis", new ArrayList<Integer>(Arrays.asList(2008, 2020)));
        vehicles.put("Avalon", new ArrayList<Integer>(Collections.singletonList(2017)));
        vehicles.put("Camry", new ArrayList<Integer>(Arrays.asList(2015, 2016, 2017)));
        vehicles.put("Corolla", new ArrayList<Integer>(Arrays.asList(2015, 2017, 2020)));

       
        Scanner sc = new Scanner(System.in);
        
       
        String input = sc.nextLine();

        
        if(vehicles.containsKey(input)) {
            System.out.println("Oh, you're looking for a" + input + "?");
            
             
            ArrayList<Integer> list = vehicles.get(input);

            for (Integer make : list) {
                System.out.println("Name: " + input + " make: " + make);
            }
        }else {
            
        	System.out.println("Sorry we currently do not have any " + input + " vehicle");
        }
  }

}
