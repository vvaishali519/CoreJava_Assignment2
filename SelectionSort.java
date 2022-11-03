import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		// finding the minimum element of array and pushing it to the left most index.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		System.out.print("Enter the elements of Array : ");
        for(int i=0;i<size;i++) {
        	a[i] = sc.nextInt();
        }
        
        for(int i=0;i<size-1;i++) {
        	int minIndex=i;
        	for(int j=i+1;j<size;j++) {
        		if(a[j]<a[minIndex]) {
        			minIndex = j;
        		}
        	}
        	int temp=a[minIndex];
        	a[minIndex]=a[i];
        	a[i]=temp;
        }
        
        System.out.print("Sorted Array is : ");
        for(int i:a) {
        	System.out.print(i+" ");
        }
	}

}
