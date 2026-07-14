package TwoDimArray;

public class MatrixMultiplication {
	public static void print(int[][] arr) {
		int m=arr.length,n=arr[0].length;
		for(int i=0;i<m;i+=1) {
			for(int j=0;j<n;j+=1) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a= {{1,2,1},{2,1,2}};
		int[][] b= {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
		if(a[0].length!=b.length) {
			System.out.println("Multiplication not possible");
		}
		else {
			int[][] c=new int[a.length][b[0].length];
			for(int i=0;i<c.length;i+=1) {
				for(int j=0;j<c[0].length;j+=1) {
					for(int k=0;k<b.length;k+=1) {
						c[i][j]+=(a[i][k]*b[k][j]);
					}		
				}	
			}
			print(a);
			System.out.println();
			print(b);
			System.out.println();
			print(c);
		}
	}
}
