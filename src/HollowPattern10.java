import java.util.*;
public class HollowPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc  =new Scanner(System.in);
    System.out.println("Enter the Number of Rows:");
    int n =sc.nextInt();
    for(int i=1;i<=n;i++) {
    	for(int j = 1;j<=6-i;j++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=6-i;j++) {
    		if(i==1||j==1||j==6-i) {
    			System.out.print("*");
    		}else {
    			System.out.print(" ");
    		}
    		
    	}System.out.println();
    }
	}

}
//Enter the Number of Rows:
//5
//*****
//*  *
//* *
//**
//*
