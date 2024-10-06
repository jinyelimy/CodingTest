class Solution {
    public int solution(int a, int b) {
		 
	        int ansB = b/gcd(a,b);
	        
	        while(ansB !=1) {
		        if (ansB%2==0) {
					ansB /=2;
				} else if( ansB%5==0) {
					ansB /=5;
				} else {
					return 2;
				}		        
	        }	        
	        return 1;
	    }

	 
	private int gcd(int a, int b) {
		if (b==0) {
			return a; 
		}		
		return gcd(b, a%b);
	}
}