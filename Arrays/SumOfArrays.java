package arrays;

public class SumOfArrays {

	public static void main(String[] args) {
		int[] arr= {81,17,95,36,31,100,60};
		int sum=0;
		for(int i=0;i<arr.length;i+=1) {
			sum+=arr[i];
		}
		System.out.println(sum);

	
	}
}
