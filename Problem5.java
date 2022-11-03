import java.util.*;

public class Problem5 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the size of Array A: ");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		System.out.print("Enter the elements of Array A: ");
        for(int i=0;i<size;i++) {
        	a[i] = sc.nextInt();
        }
		
        System.out.print("Enter the size of Array B: ");
		int size1 = sc.nextInt();
		
		int[] b = new int[size1];
		System.out.print("Enter the elements of Array B: ");
        for(int i=0;i<size1;i++) {
        	b[i] = sc.nextInt();
        }
        
        System.out.println("Approach 1");
        
		int count=0;
		
		for(int i=0;i<b.length;i++) {
			int ele = b[i];
			for(int j=0;j<a.length;j++) {
				if(a[j] == ele) {
					count++;
				}
			}
		}
		
		if(count >= 1) {
			System.out.println("Array B is a subset of Array A");
		}else {
			System.out.println("Array B is not a subset of Array A");
		}
		
		System.out.println("Approach 2");
		// 1. Sorting the Array , 2. Binary Search.
		int flag=0;
		Arrays.sort(a);
		
		for(int i=0;i<b.length;i++) {
			int low = 0;
			int high = a.length-1;
			for(int j=0;j<a.length;j++) {
				int mid = (low+high)/2;
				if(a[mid] == b[i]) {
					flag++;
				}else if(b[i] < a[mid]) {
					high = mid-1;
				}else if(b[i] > a[mid]) {
					low = mid+1;
				}
			}
		}
		if(flag>=1) {
			System.out.println("Array B is a subset of Array A");
		}else {
			System.out.println("Array B is not a subset of Array A");
		}
		

	}

}
