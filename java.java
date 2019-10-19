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
		
		int k = Integer.parseInt(inp_arr[0]);
		int j = Integer.parseInt(inp_arr[2]);
		
		int numOfWords = 0;
		
		int smallest = (k < j) ? k : j;
		int larger = (k>j)? k :j; 
		
		int max_from_one_rapper;
		if(smallest < 3){
			numOfWords = 0;
			System.out.println(numOfWords);
	        System.exit(0);
	    }
	    else if(smallest == 3){
	        max_from_one_rapper = smallest;
	    }
	    else{
	        max_from_one_rapper = smallest - 1;
		}
		int combinations = 0;
		while(numOfWords != 3){
			for(int x = 1; x<larger; x++){
				for(int y = 1; y<smallest;y++){
					numOfWords = x+y;
				}
				if(numOfWords == 3){
					combinations +=1;
				}

			}
			System.out.println(numOfWords);
			in.close();
		}
		
	}

}