import java.util.*;
public class HollowPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter The no. of rows:");
int n = sc.nextInt();
for(int i = 1;i<=n;i++) {
	for(int j = 1;j<=i;j++) {
		System.out.print(" ");
	}
	for(int j = 1;j<=11-2*i;j++){
	if(i==1||j==1||j==11-2*i) {
		System.out.print("*");
	}else {
		System.out.print(" ");
	}
	}
		System.out.println();
	}
}
	}
//Enter The no. of rows:
//5
//*********
// *     *
//  *   *
 //  * *
 //   *
