import java.util.*;
public class HollowPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the No. of Rows:");
       int n = sc.nextInt();
       for(int i = 1;i<=n;i++) {
    	   for(int j = 1;j<=6-i;j++) {
    		   System.out.print(" ");
    	   }for(int j = 1;j<=2*i-1;j++) {
    	if(j==1||i==n||j==2*i-1) {
    		   System.out.print("*");
    	}else {
    		System.out.print(" ");
    	}
    	   }
    	   System.out.println();
       }
	}

}
//Enter the No. of Rows:
//5
//    *
//   *  *
//  *    *
// *      *
// *********

