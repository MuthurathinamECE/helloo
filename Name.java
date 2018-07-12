package day17;
import java.util.Scanner;
public class Name {
	public static void main(String[] args) {
		String a,b,c="";
		int i,j,l=0,k=0;
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		b=sc.next();
		l=a.length();
		k=b.length();
		String arr[]=new String[l];
		String arr1[]=new String[k];
		for(i=0;i<l;i++){
			arr[i]=a.substring(i,i+1);
		}
		for(j=0;j<k;j++){
			arr1[j]=b.substring(j,j+1);
			}
		for(i=0;i<l;i++){
			if(arr[i].equals(arr1[i])){
				c=c+arr[i];
				}
			}
			
		System.out.println(c);
	}

}
