// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    
		permutation();
	}

	public static void permutation(){
		Scanner in = new Scanner(System.in);
		String [] len = in.nextLine().split(" ");
		String[] arr = in.nextLine().split(" ");
		String[] set = in.nextLine().split(" ");
		int[] set1 = Arrays.stream(set).mapToInt(Integer::parseInt).toArray();

		int totalLen = arr.length + set.length;
		Integer [] result = new Integer[totalLen];
		int ind = 0;


		if(arr.length != Integer.parseInt(len[0]) || set.length != Integer.parseInt(len[1])){
			System.out.println(totalLen);
        	in.close();
        	System.exit(0);
		}
		Arrays.sort(set1);
		//loop to ckeck if current num is small than next - insert
		
		for(int j = 0; j<arr.length;j++){
			for(int i = 0; i<set1.length;i++){
				if(set1[i] != -1){
					if((set1[i]) < Integer.parseInt(arr[j])){
						result[ind] = (set1[i]);
						ind++;
						set1[i] = -1; 
					}else{
						result[ind] = Integer.parseInt(arr[j]);
						ind++;
						
					}
				}
			}

		}
		result[result.length-1] = Integer.parseInt(arr[arr.length-1]);

	
        for(int n = 0; n<result.length;n++){
			System.out.print(result[n]+" ");
		}

        in.close();
        System.exit(0);
	
	}








	public static boolean isInteger(String str) {
    if (str == null) {
        return false;
    }
    int length = str.length();
    if (length == 0) {
        return false;
    }
    int i = 0;
    if (str.charAt(0) == '-') {
        if (length == 1) {
            return false;
        }
        i = 1;
    }
    for (; i < length; i++) {
        char c = str.charAt(i);
        if (c < '0' || c > '9') {
            return false;
        }
    }
    return true;	
	}
	public static void rappers(){
		Scanner in = new Scanner(System.in);
		
		String inp = in.nextLine();
		
		String [] inp_arr = inp.split("");
		
		if(inp_arr.length < 2) {
			System.out.println(0);
			System.exit(0);
		}
		
		if(!isInteger(inp_arr[0]) || !isInteger(inp_arr[2])){
			System.out.println(0);
			System.exit(0);
		}
		int k = (inp_arr[0] != null) ? Integer.parseInt(inp_arr[0]) : 0 ;
		int j = (inp_arr[2] != null) ? Integer.parseInt(inp_arr[2]) : 0 ;
				
		int smallest = (k < j) ? k : j;
		int larger = (k>j)? k :j; 
		
		if(smallest < 3 || k < 0){
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

		