package TwoDimArray;

public class Transpose {

	public static void main(String[] args) {
		int[][] arr= {{1,2},{3,4},{5,6}};
		int m=arr.length,n=arr[0].length;
		int[][] transpose=new int[n][m];
		for(int i=0;i<n;i+=1) {
			for(int j=0;j<m;j+=1) {
				transpose[i][j]=arr[j][i];
			    System.out.print(transpose[i][j]+" ");
			}
		    System.out.println();
		}
	}
}
