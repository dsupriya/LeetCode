import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		int n = array.length;
		int []ans = new int[2];
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			int rem = targetSum - array[i];
			if(hm.containsKey(rem))
			{
			   ans[0] = array[i];
				 ans[1] = rem;
				 return ans;
			}
			else
				hm.put(array[i],1);
		}
    return new int[0];
  }
}
