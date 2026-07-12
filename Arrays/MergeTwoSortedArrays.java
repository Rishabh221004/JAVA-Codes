package arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] a= {11,13,15,89};
		int[] b= {7,9,18,19,87};
		int m=a.length,n=b.length;
		int[] c=new int[m+n];
		int i=0,j=0,k=0;
		// Merging
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				c[k]=a[i];
				i+=1;
			}
			else {
				c[k]=b[j];
				j+=1;
			}
			k+=1;
		}
		if(i==m) {
			while(j<n) {
				c[k]=b[j];
				j+=1;k+=1;
			}	
		}
		if(j==n) {
			while(i<m) {
				c[k]=a[i];
				i+=1;k+=1;
			}	
		}
		for(int ele: c) {
        	System.out.print(ele+" ");
        }
		
	}

}
