import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GetSubArrayFromGivenSum {

	public static void main(String[] args) {

		int[] array = { 60, 10, 7, 1, 2, 9, 11, 108, 110,1,2,3,4,5,6,51 };
		
		
		getSubArray(array, 50);

	}

	private static void getSubArray(int[] array, int n) {
		int len = array.length;
		Map<Integer, List<Integer>> map=new LinkedHashMap<Integer, List<Integer>>();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (array[i] <= n) {
				sum = 0;
				List<Integer> output=new ArrayList<Integer>(); int k=0;
				for (int j = i; j < len; j++) {
					sum +=array[j];
					if (array[j] < n && sum <= n) {
						output.add(array[j]);
					}
				}
				map.put(sum,output);
			}
		}

		int countSum=0;
		List<Integer> outputList;
		Object[] outputArray=new Object [len];
		for(Entry<Integer, List<Integer>> entry: map.entrySet()) {
			outputList=entry.getValue();
			if(outputList.size()>countSum) {
				countSum=outputList.size();
				outputArray=outputList.toArray();
				
			}
		}
		System.out.println(Arrays.asList(outputArray));
	}



}
