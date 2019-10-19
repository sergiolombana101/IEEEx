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
		
		double numOfWords = 0;
		
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

		while(numOfWords != 3){
			double toAdd = 0;
		    numOfWords = Math.floor(larger / 2);
		    if(numOfWords<smallest){
				toAdd = smallest - numOfWords;
				numOfWords = numOfWords + toAdd;
		        
		    }else{
		        numOfWords = numOfWords/2;
		    }
		    if(numOfWords == 3){
				System.out.println((int)numOfWords);
				in.close();
				System.exit(0); 
			}
		    
		    
		}

		
	}
		
	}