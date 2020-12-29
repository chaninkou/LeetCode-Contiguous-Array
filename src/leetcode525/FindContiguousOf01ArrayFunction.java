package leetcode525;

import java.util.HashMap;
import java.util.Map;

public class FindContiguousOf01ArrayFunction {
	public int findMaxLength(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		// Make all the 0 to -1 first
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = -1;
			}
		}

		int sum = 0;
		int max = 0;

		// Whenever sum get add up to 0, we know we should add
		map.put(0, -1);

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

			if (map.containsKey(sum)) {
				max = Math.max(max, i - map.get(sum));
			} else {
				map.put(sum, i); // Key wil increase if the pattern of the array is 1,1,1,1,1,1,1,1,1
			}

		}

		return max;
	}
	
    public int findMaxLength2(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        int zero=0;
        int one=0;
        int len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }
            
            if(map.containsKey(zero-one)){
                len=Math.max(len,i-map.get(zero-one));
            }else{
                map.put(zero-one,i);
            }
        }
        
        return len;
    }
}
