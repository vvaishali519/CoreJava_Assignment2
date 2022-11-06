import java.util.Scanner;

public class QuickSort {
	
	public static int partition(int[] arr,int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int pivotIndex = partition(arr,low,high);
			
			quickSort(arr,low, pivotIndex-1);
			quickSort(arr, pivotIndex+1, high);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		quickSort(arr,0,size-1);
		
		System.out.print("Elemets after Sorting: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
