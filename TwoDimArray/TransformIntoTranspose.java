package TwoDimArray;

public class TransformIntoTranspose {
	public static void print(int[][] arr) {
		int m=arr.length,n=arr[0].length;
		for(int i=0;i<m;i+=1) {
			for(int j=0;j<n;j+=1) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		print(arr);
		// Transposing
		int m=arr.length;
		for(int i=0;i<m;i+=1) {
			for(int j=0;j<i;j+=1) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;		
			}
		}
		print(arr);
		// Rotate --> Reverse each row
		for(int i=0;i<m;i+=1) {
			int a=0,b=m-1;
			while(a<b) {
				// Swap arr[i][a]= arr[i][b]
				int temp=arr[i][a];
				arr[i][a]=arr[i][b];
				arr[i][b]=temp;
				a+=1;
				b-=1;
			}
		}
		print(arr);
	}
}
