class Solution {
     public int solution(int n) {
	        int answer = 0;
	        int mix = lcm(n,6);
	        answer = mix/6;
	        
	        return answer;
	    }

	 // 최대 공약수 
	 public static int gcd(int a, int b) {
		    if (b == 0) return a;
		    return gcd(b, a % b);
		}
	 
	 // 최소공배수
	 public static int lcm(int a, int b) {
		    return a * b / gcd(a, b);
		}
}