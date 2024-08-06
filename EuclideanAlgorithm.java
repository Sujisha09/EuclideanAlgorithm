/**Euclidean Algorithm for finding Greatest Common divisor(GCD)*/
package assignments;
import java.util.*; //importing util package 
/**
 * @author devin
 *
 */
public class EuclideanAlgorithm {
	public static int gcd(int a,int b) { //defining gcd function
		while (b != 0) {	//this while loop continues to run until one number is 0(here I took b)
			int temp = b;   //Storing value of b in a temp
	        b = a % b;		//remainder of a divided by b is assigned to b
	        a = temp;		//assigning temp value to b
	        }
		return a;	//returning a value
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,res;
		// Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        //enter values
        System.out.print("Enter the value of a: ");
        a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        b = scanner.nextInt();
        //calling gcd function and assigning returned value to res
        res=gcd(a,b);
        //printing result
        System.out.print("gcd("+a+","+b+") is "+res);
        scanner.close();//closing scanner obj
	}
}
