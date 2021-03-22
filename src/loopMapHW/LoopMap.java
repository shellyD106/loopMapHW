package loopMapHW;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopMap {
	 public static void main(String[] args) {
	      
	        ArrayList<Double> list = new ArrayList<>();


	        Scanner sc = new Scanner(System.in);

	        for(int i = 0; i < 5; i++) {
	            System.out.println("Please enter number " + (i + 1));
	            list.add(sc.nextDouble());
	        }

	        
	        double sum = 0, product = 1, largest = list.get(0), smallest = list.get(0);

	       
	        for(int i = 0; i < 5; i++) {
	            sum += list.get(i); 
	            product *= list.get(i); 

	            largest = Math.max(largest, list.get(i)); 
	            smallest = Math.min(smallest, list.get(i)); 
	        }

	        
	        System.out.println("The sum is: " + sum);
	        System.out.println("The product is: " + product);
	        System.out.println("The largest is: " + largest);
	        System.out.println("The smallest is: " + smallest);
	    }
}



