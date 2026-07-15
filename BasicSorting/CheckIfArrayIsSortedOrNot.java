package BasicSorting;

public class CheckIfArrayIsSortedOrNot {

	public static void main(String[] args) {
		int[] arr= {1,12,15,19,41};
		int n=arr.length;
		boolean flag=true;   // true -> sorted
		for(int i=0;i<n-1;i+=1) {
			if(arr[i]>arr[i+1]) {
				flag=false;  // false -> unsorted
				break;
			}
		}
		if(flag==true) System.out.println("Sorted");
		else System.out.println("Unsorted");

	}

}
