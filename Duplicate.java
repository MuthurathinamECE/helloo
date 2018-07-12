package day17;
import java.util.Scanner;
public class Duplicate {
public static void main(String args[]){
	int a,i,j,c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	a=sc.nextInt();
	int arr[]=new int[a];
	for(i=0;i<a;i++){
		arr[i]=sc.nextInt();
	}
	for(i=0;i<a;i++){
		for(j=i+1;j<a;j++){
			if(arr[i]==arr[j]){
				arr[i]=0;
				arr[j]=0;
		}
		}
	if(arr[i]!=0){
        System.out.println(arr[i]);		
}
	}
}
}
