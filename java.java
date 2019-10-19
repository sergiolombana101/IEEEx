// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		
		String inp = in.nextLine();
		
		String [] inp_arr = inp.split("");
		
		if(inp_arr.length < 2) {
			System.out.println(0);
			System.exit(0);
		}
		if(inp_arr[0] instanceof String || inp_arr[2] instanceof String){
			System.out.println(0);
			System.exit(0);
		}
		int k = (inp_arr[0] != null) ? Integer.parseInt(inp_arr[0]) : 0 ;
		int j = (inp_arr[2] != null) ? Integer.parseInt(inp_arr[2]) : 0 ;
				
		int smallest = (k < j) ? k : j;
		int larger = (k>j)? k :j; 
		
		if(k < 0){
		    System.out.println(0);
		}
		if(smallest < 3){
			System.out.println(0);
	        System.exit(0);
	    }
		int combinations = 0;
		for(int x = 1; x<=larger; x++){
			for(int y = 1; y<=smallest;y++){
				if(x+y == 3){
					combinations +=1;
				}
			}
		}
        in.close();
		System.out.println(combinations);
		
	}
}

		