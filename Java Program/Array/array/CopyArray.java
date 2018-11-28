package array;

public class CopyArray {

	public static void main(String[] args) {
		char[] copyForm = {'a', 'b', 'c', 'd'};
		
		char[] copyTo = new char[copyForm.length];
		System.arraycopy(copyForm, 1, copyTo, 0, copyForm.length-1);
		System.out.println(String.valueOf(copyTo));
	}
}
