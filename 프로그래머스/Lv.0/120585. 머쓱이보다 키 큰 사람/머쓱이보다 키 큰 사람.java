import java.util.ArrayList;

class Solution {
public int solution(int[] array, int height) {
        ArrayList<Integer> newarray = new ArrayList<Integer>(array.length);
        
        for (int i = 0; i < array.length; i++) {
			if (array[i]>height) {				
					newarray.add(array[i]);			
			} // if 
		} // for
        	return newarray.size();
	}
}
