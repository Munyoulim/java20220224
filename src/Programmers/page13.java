package Programmers;

public class page13 {
	public static void main(String[] args) {
		
		// 
		class Solution {
		    public long[] solution(int x, int n) {
		        long[] answer = new long[n];
		        
		        for (int i = 1; i <= n; i++) {
		            answer[i-1] = x * (long)i;
		            
		        // for (int i = 0; i < n; i++) {
		        // answer[i] = x * (i +1L);
		        }
		        return answer;
		    }
		}
		
		// 
		class Solution {
		    public int[][] solution(int[][] arr1, int[][] arr2) {
		        int[][] answer = new int[arr1.length][arr2[0].length]; // 첫번째 행의 열의 길이
		        
		        for (int i = 0; i < answer.length; i++) {
		            for (int j = 0; j < answer[i].length; j++) {
		                for(int k =0; k<arr1[i].length; k++){
		                    answer[i][j] += arr1[i][k] * arr2[k][j];
		                }
		            }
		        }
		        return answer;
		    }
		}
	}
}
