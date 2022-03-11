package Leetcode;

public class Solution2000 {
	public static reversePrefix(String word, char ch) {
		int index = 0;
		
		// 문자열을 char 배열로 변환
		char[] arr = word.toCharArray();
		
		// char 배열 출력
		for (int i = 0; i < arr.length; i++) { 
			if(arr[i] == ch) {
				index = 1;
				break;
			}
		}
		
		int left = 0;
		int right = index;
		
		while (left < right) {
			char temp = arr[left];
			// 바꾸기
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		return new String(arr);
	}
}
