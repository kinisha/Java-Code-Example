package array;

public class PassingArrayToMethod {
	static void min(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		min(a);
	}
}
