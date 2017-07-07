import java.util.*;

public class InputArry{

	public static void main(String[] args){
		InputArry();

		Scanner sc = new Scanner(System.in);   
		System.out.println("input arry A: ");
		// int x=sc.nextInt();
		int n=5;
		int[] a=new int[n];     // DataType[] data;  
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("arry A: ");
		for(int i=0;i<n;i++){
			System.out.println(a[i]+"");
		}

		// System.out.println("input arry B: ");
		// int[] b=new int[n];
		// for (int i=0;i<n;i++){
		// 	b[i]=sc.nextInt();
		// }
		// System.out.println("arry B: "+ b);
		// System.out.println("arry B: ");
		// for(int i=0;i<n;i++){
		// 	System.out.println(b[i]+"");
		// }
	}
}