import java.util.Arrays;
class Solution {
   public int solution(int[] array) {
	        int answer = 0;
	        int index;
	        Arrays.sort(array);
	        index = (array.length-1)/2;
	        answer = array[index];
	        return answer;
	    }
}