class Solution {
     public int solution(int n) {
		 	// n=4 
	        int answer = 0;
	        for (int i = 0; i <=n; i++) {
				if (i%2==0) {
					answer += i;
				}
			}
	        return answer;
	    }
}
