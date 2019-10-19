// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryTree{

		public BSTNode root;
		String anStr = "";

		public BinaryTree(){
            root = null;
        }

        public void insert(int data)
        {
            root = insertHelp(root, data);
        }
        public BSTNode insertHelp(BSTNode current, int data)
        {
            if (current == null)
			{
				return new BSTNode(data);
			}
			//increase the depth count
            if (current.data > data)
            {
				current.depth++;
 				current.left = insertHelp(current.left, data);
			}   
            if (current.data < data)
            {
				current.depth++;
				current.right = insertHelp(current.right, data);
			}

			System.out.print(current.depth + " ");
			return current;
		}
}

class BSTNode
{
	public int data;
	public int depth;
	public BSTNode left;
	public BSTNode right;

	public BSTNode(int data)
	{
		this.data = data;
		depth = 1;
		left = null;
		right = null;
	}
}
		

// Please name your class Main
class Main {
	
	
	public static void main (String[] args) throws java.lang.Exception {
	    
		BinaryTree t = new BinaryTree();
		Scanner in = new Scanner(System.in);

		int numEl = Integer.parseInt(in.nextLine());
		String [] numStr = in.nextLine().split(" ");
		int[] nodes = new int[numEl];
		// String anStr = "";

		for(int i = 0; i < numEl; i++){
			nodes[i] = Integer.parseInt(numStr[i]);
		}

		for (int i = 0; i < numEl; i++){
			t.insert(nodes[i]);
		}

		//making the answer string - depths
		// for(int i = 0; i < numEl; i++){
		// 	anStr += ans[i];
		// 	anStr += " ";

		// }
		//System.out.println(anStr);

		in.close();
		
	}






	public static void weight(){
		//ascii to compare
	    //65 - 90 -> uppercase
	    //97 - 122 ->lowercase (substract 32)
	    //check for uppercase, convert if needed
	    
	    Scanner in = new Scanner(System.in);
	    
        int numRaces = Integer.parseInt(in.nextLine().split(" ")[0]);
        int numCom = Integer.parseInt(in.nextLine().split(" ")[1]);
        int ans = 0;
        
        for (int i = 0; i < numCom; i++){
            String com = in.nextLine();
            byte[] bytes = com.getBytes("US-ASCII");
            
            //if lowercase
            if(bytes[0] >= 97 && bytes[0] <= 122){
                bytes[0] -= 32;
            }
            if(bytes[1] >= 97 && bytes[1] <= 122){
                bytes[1] -= 32;
            }
            
            //if a letter
            if((bytes[0] >= 65 && bytes[0] <= 90) || 
                (bytes[1] >= 65 && bytes[1] <= 90)){
                
                //DO SOMETHING  
            }
            else{
             
                in.close();
            
                //will be 0 if the values are not letters
                System.out.println(0); 
                System.exit(0);
            }
            
        }
        
        in.close();
            
        System.out.println(ans); 
        System.exit(0);
	}

	public static void teams(){
		Scanner in = new Scanner(System.in);
		int numOfPpl = 0;
		int numTeams = Integer.parseInt(in.nextLine());

		for(int i = 0; i < numTeams; i++){
			//check if all members sit beside each other.
			String[] line = in.nextLine().split("");
			String team = line[i];

			for(int j = i; j < numTeams; j++){
				if(line[j] == line[i]){
					team = line[i];
					line[i] = line[j];
					line[j] = team;
					numOfPpl++; 
				}
				System.out.println(numOfPpl);
			}
			  
		}

		in.close();
		
	}

	public static void pc(){
		Scanner in = new Scanner(System.in);
		int ans = 0;
		int cases = Integer.parseInt(in.nextLine());


		// for each test case
		for (int i = 0; i < cases; i++) {
			
			double budget = Double.parseDouble(in.nextLine());
			int comps = Integer.parseInt(in.nextLine());

			//line 4
			String [] optsPerComp = in.nextLine().split(" ");
			for(i = 0; i < comps; i++){
				optsPerComp[i] = Integer.parseInt(optsPerComp[i]);
			}


			//map options with values
			// for (int j = 0; j < comps; j++){
			// 	int len = (in.nextLine().split(" ").length);
			// 	//System.out.println(len);
			// 	int [] optCosts = new int[len];
			// 	opts[i] = optCosts;


			// }
		}
		
		//System.out.println(ans);
		in.close();
	};

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

