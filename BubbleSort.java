import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter size of arrays :");
		  int size = sc.nextInt();
		  int[] a = new int[size];
		  
		  System.out.print("Enter Elemets of Array : ");
		  for(int i=0;i<size;i++) {
			  a[i]=sc.nextInt();
		  }
		
		  
		// Sorting Array in Ascending Order. --> Comparing adjacent elements and looping till length of array.
		for(int i=0;i<a.length;i++) 
		{
			for(int j=1;j<a.length-i;j++) {
				int temp=0;
				if(a[j-1] > a[j]) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		
		System.out.println("Sorted Array in Ascending order is ");
		for(int s : a) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		// Sorting Array in Descending Order.
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				int temp=0;
				if(a[j-1]<a[j]) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
				
			}
		}

		System.out.println("Sorted Array in Descending order is ");
		for(int s : a) {
			System.out.print(s+" ");
		}
		
		
	}

}
