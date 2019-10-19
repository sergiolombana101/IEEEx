import java.util.*;
import java.util.stream.IntStream;


import java.lang.*;
import java.io.*;

class main {
	public static void main (String[] args){
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
		in.close();

	}
	public void func1(){
		Scanner in = new Scanner(System.in);
		
		String inp = in.nextLine();
		
		String [] inp_arr = inp.split("");
		
		if(inp_arr.length < 2) {
			System.out.println(0);
			System.exit(0);
		}
		int k = (inp_arr[0] != null) ? Integer.parseInt(inp_arr[0]) : 0 ;
		int j = (inp_arr[2] != null) ? Integer.parseInt(inp_arr[2]) : 0 ;
		
		int numOfWords = 0;
		
		int smallest = (k < j) ? k : j;
		int larger = (k>j)? k :j; 
		
		if(smallest < 3){
			numOfWords = 0;
			System.out.println(numOfWords);
	        System.exit(0);
		}
		List<Integer> combs = new ArrayList<>(); 
		int[] temp = new int[3];
		int combinations = 0;
		for(int x = 1; x<larger; x++){
			for(int y = 1; y<smallest;y++){
				temp[0] = x;
				temp[1] = y;

			}
			/*
			for(int y = 1; y<smallest;y++){
				numOfWords = x+y;
				if(numOfWords == 3){
					combinations +=1;
				}
			}*/
		}

		System.out.println(combinations);
		
	
	}
	public void rooks(){
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.nextLine());
		int[] chessboard = new int[size];
		while(in.nextLine() == null || in.nextLine() == ""){
			chessboard[]
		}
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
	public static String[] swap(int a, int b, String[] arr){
		String temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
		for(int x = 0; x<arr.length;x++){
			System.out.print(arr[x]);
		}
		System.out.println(" ");
		return arr;
	}

	public static void reshuffle(){
		Scanner in = new Scanner(System.in);
		int numOfChanges = 0;

		int numTeams = Integer.parseInt(in.nextLine());
		int[] teamPlaces = new int[4];
		boolean valid = false;
		for(int z = 0; z<teamPlaces.length;z++){
			teamPlaces[z] = -1;
		}

		for(int i = 0; i<numTeams;i++){
			String line[] = in.nextLine().split("");
			for(int person = 0; person<line.length;person++){
				switch(line[person]){
					case "A":
						if(teamPlaces[0] != person-1 && teamPlaces[0] != -1 && !valid ){
							for(int t = person; t<line.length;t++){
								if(line[person].equals(line[person+1])){valid=true;}
							}
							//if(line[0].equals(line[line.length-1])&&person == line.length-1){continue;}
							numOfChanges += 2;
							String[] temp_arr = line;
							line = swap(person, teamPlaces[0]+1, line);
							if(temp_arr.equals(line)){numOfChanges-=2;}
							int temp = teamPlaces[0]+1;
							teamPlaces[0+1] = person;
							teamPlaces[0] = temp;
							continue;
						}
						if(person+1 == line.length){
							teamPlaces[0] = line.length-1;
						}
						if(person+1<line.length&&line[person+1] != "A"){
							teamPlaces[0] = person;
						}
						break;
					case "B":
						if(teamPlaces[1] != person-1 && teamPlaces[1] != -1){
							if(line[0].equals(line[line.length-1])&&person == line.length-1){continue;}
							numOfChanges += 2;
							line = swap(person, teamPlaces[1]+1, line);
							int temp = teamPlaces[1]+1;
							teamPlaces[1+1] = person;
							teamPlaces[1] = temp;
							continue;

						}
						if(person+1 == line.length){
							teamPlaces[1] = line.length-1;
						}
						if(person+1<line.length&&line[person+1] != "B"){
							teamPlaces[1] = person;
						}
						break;
					case "C":
						if(teamPlaces[2] != person-1 && teamPlaces[2] != -1){
							for(int t = person; t<line.length;t++){
								if(person<line.length-1&&line[person].equals(line[person+1])){valid=true;}
							}
							if(valid){break;}
							numOfChanges += 2;
							line = swap(person, teamPlaces[2]+1, line);
							int temp = teamPlaces[2]+1;
							teamPlaces[2+1] = person;
							teamPlaces[2] = temp;
							continue;

						}
						if(person+1 == line.length){
							teamPlaces[2] = line.length-1;
						}
						if(person+1<line.length&&line[person+1] != "C"){
								teamPlaces[2] = person;
						}
						break;
					case "D":
						if(teamPlaces[3] != person-1 && teamPlaces[3] != -1){
							if(line[0].equals(line[line.length-1])&&person == line.length-1){continue;}
							numOfChanges += 2;
							line = swap(person, teamPlaces[3]+1, line);
							int temp = teamPlaces[3]+1;
							teamPlaces[3+1] = person;
							teamPlaces[3] = temp;
							continue;
						}
						if(person+1 == line.length){
							teamPlaces[3] = line.length-1;
						}
						if(person+1<line.length&&line[person+1] != "D"){
							teamPlaces[3] = person;
						}
						break;

				}


			}
			System.out.println(numOfChanges);
			for(int z = 0; z<teamPlaces.length;z++){
				teamPlaces[z] = -1;
			}
			valid = false;

			
		}

		/*
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

		in.close();*/
	}
}



class BSTNode
{
	public int data;
	public static int depth;
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
			if(current.right != null){
				System.out.print(current.depth+" ");
			}
            if (current == null)
			{
				BSTNode temp = new BSTNode(data);
				
				System.out.print(temp.depth + " ");
				temp.depth++;
				return temp;
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

			return current;
		}
}



