	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			return new int[] { -1 };
		}

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int[] answer = new int[arr.length - 1];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				answer[j] = arr[i];
				j++;
			}
		}

		return answer;
	}
}

























		// 
		public int[] solution(int[] arr) {
	        // 배열길이가 1인 경우
	        if (arr.length == 1) {
	            int[] answer = {-1};
	            return answer;
	        } 
	        
	        // 배열길이가 1보다 클 때 
	        // 가장 작은 수를 뺀 길이로 초기화
	        int[] answer = new int[arr.length-1];
	        
	        // 제일 작은 수를 구한다.
	        int min = arr[0];
	        for (int i = 0; i < arr.length; i++) {
	            if (min > arr[i]) {
	                min = arr[i];
	            }
	        }
	        
	      // 반복문 index 용
	        int index = 0;
	        for (int i = 0; i < arr.length; i++) {
	        	//배열의 값이 가장 작은 수라면
	        	if(arr[i] == min){
	        		//continue를 이용해 배열에 넣지 않고 넘어간다
	        		 continue;
	        	}
	        	answer[index++] = arr[i];
	        }
	        return answer;
	    }
	}

