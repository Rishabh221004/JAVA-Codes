package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		int n=arr.length;
		for(int ele:arr){
			System.out.print(ele+" ");
		}
		System.out.println();
		// reverse
		
//		for(int i=0;i<n/2;i+=1) {
//			int temp=arr[i];
//			arr[i]=arr[n-1-i];
//			arr[n-1-i]=temp;
		
		int i=0,j=n-1;
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
     		arr[j]=temp;
     		i+=1;
     		j-=1;
			
		}
		for(int ele:arr){
			System.out.print(ele+" ");
		}
		System.out.println();

	}

}
