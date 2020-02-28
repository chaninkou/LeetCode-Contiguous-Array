package contiguous;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {0,1,0,1};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindContiguousOf01ArrayFunction solution = new FindContiguousOf01ArrayFunction();
		
		System.out.println("Solution: " + solution.findMaxLength(nums));
	}
}
