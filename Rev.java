package day17;

import java.util.Scanner;

public class Rev {
	public static void main(String[] args) {
		int a,i;
		String b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		int arr[]=new int[a];
		for(i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		for(i=a-1;i>=0;i--){
		b=b+arr[i];
		}
		System.out.println(b);
}
}
