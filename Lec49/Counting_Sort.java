package Lec49;

import java.util.Arrays;

public class Counting_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
		int[] a = Sort(arr);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static int[] Sort(int[] arr) {
		// TODO Auto-generated method stub
		int max = Arrays.stream(arr).max().getAsInt();
		int[] freq = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			int e = arr[i];
			freq[e]++;// freq[e]= freq[e]+1;
		}
		for (int i = 1; i < freq.length; i++) {
			freq[i] = freq[i - 1] + freq[i];
		}
		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			int c = freq[arr[i]];
			ans[c - 1] = arr[i];
			freq[arr[i]]--;
//			int e = arr[i];
//			int c = freq[e];
//			ans[c - 1] = e;
//			freq[e]--;

		}
		return ans;

	}

}
