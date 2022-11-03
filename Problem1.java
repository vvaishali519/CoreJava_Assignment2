import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter size of arrays :");
		  int size = sc.nextInt();
		  int[] ar = new int[size];
		  
		  System.out.print("Enter Elemets of Array : ");
		  for(int i=0;i<size;i++) {
			  ar[i]=sc.nextInt();
		  }
		  System.out.println("* Approach 1 using for loops *");
		  System.out.print("Duplicate Elements are : ");
		  for(int i=0;i<size-1;i++) {
			  for(int j=i+1;j<size;j++) {
				  if(ar[i] == ar[j]) {
					  System.out.print(ar[i]+" ");
					  break;
				  }
			  }
		  }
		  System.out.println();
		  
		  System.out.println("* Approach 2 using count array *");
		  int[] count = new int[size];
		  System.out.print("Duplicate Elements are : ");
		  for(int i=0;i<size;i++) {
			    if(count[ar[i]] >= 1) {
			    	System.out.print(ar[i]+" ");
			    }else {
			    	count[ar[i]]++;
			    }
		   }
	 }
		 
}
