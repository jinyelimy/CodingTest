class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       
		// 분자
        int numer = (numer1*denom2) + (numer2*denom1); 
        
        // 분모
        int denom = denom1*denom2;
        
        
        // 최대공약수 초기화 
       int max = 1;
       
       // 최대공약수 찾기
       for (int i = 1; i <= numer; i++) {
    	  if (numer%i == 0 && denom%i == 0) {
			max = i;
    	  } // if
       } // for
      
       
       // 기약분수 만들기
       numer = numer/max;
       denom = denom/max;
       
       
       // 정답 배열 
       int[] answer = {numer,denom};
       return answer;
    }
}