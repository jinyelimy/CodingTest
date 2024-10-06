import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum =0;
        ArrayList<Integer> ansarr = new ArrayList<Integer>();
        
        
        for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					sum = nums[i]+nums[j]+nums[k];
					ansarr.add(sum);
				}
			}
		}
        System.out.println(ansarr);
     
        
        for (int i =0; i < ansarr.size(); i++) {
        	int checknum = ansarr.get(i);
			boolean check = isPrime(checknum);
			if (check) {
				answer ++;
			}
		}

        return answer;
    }

	private boolean isPrime(int checknum) {
		int sqrt = (int) Math.sqrt(checknum);
		for (int i = 2; i <=sqrt; i++) {
			if (checknum%i ==0) {
				return false;
			}
		}
		return true;
	}
}