/**
 * 
 */

/**
 * @author SHIVANK
 *
 */
import java.util.*;
public class PatternHollow9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int n = sc.nextInt();
for(int i = 1;i<=n;i++) {
	for(int j = 1;j<=6-i;j++) {
		System.out.print(" ");
	}
	for(int j = 1;j<=i;j++) {
		if(j==1||i==n||j==i){
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
		
	}
			
			System.out.println();
}
	}

}
