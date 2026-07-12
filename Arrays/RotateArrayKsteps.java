package arrays;

public class RotateArrayKsteps {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		
		int n=arr.length;
		for(int ele:arr){
			System.out.print(ele+" ");
		}
		int k=3;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		for(int ele:arr){
			System.out.print(ele+" ");
		}
	}
	
	public static void reverse(int[] arr,int i,int j) {
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i+=1;
			j-=1;
		}
		System.out.println();
	}

}
