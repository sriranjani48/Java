import java.util.Arrays;

public class LeftRotation {

	public int[] arrayRotation(int n, int[] arr, int d) {
		int[] newArray = new int[6];
		int i, j;
		for (i = 0; i < d; i++) {
			int temp = arr[0];
			for (j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = temp;
		}
		for (i = 0; i < n; i++) {
			newArray[i] = arr[i];
		}
		return newArray;
	}
	

	public static void main(String[] args) {
		LeftRotation rotatedArray = new LeftRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int d = 2;
		System.out.println(Arrays.toString(rotatedArray.arrayRotation(n, arr, d)));
		//rotatedArray.PrintArray(arr, n, d);
	}

}
