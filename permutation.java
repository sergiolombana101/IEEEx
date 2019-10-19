// Don't place your source in a package
import java.util.Scanner;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
        String lengths = in.nextLine();
        String arrLen = lengths.split(" ")[0];
        String setLen = lengths.split(" ")[1];


        

        System.out.println(arrLen);
        System.out.println(setLen);

        in.close();
        System.exit(0);
	}
}