package hashtable;

import java.util.ArrayList;
import java.util.List;

public class Hashing {
	public static void do_hash(HashMap hash_map) {
		int[] array = Array.array();
		int flag = 0;
		double slots = Math.ceil((double) array.length / hash_map.size_of());
		List<Integer> left_over_values = new ArrayList<Integer>();
		
		for (int j = 0; j < hash_map.size_of(); j++) {
			List<Integer> values = new ArrayList<Integer>();
			for (int i = 0; i < slots; i++) {
				if (i < array.length && array.length != 1) {
					values.add(array[i]);
					array = removeElement(array, i);
					if (left_over_values.size() > 0 && flag != 1){
						for (int l = 0; l < left_over_values.size(); l++){
							values.add(left_over_values.get(l));
						}
						flag = 1;
					}
				}
				else if (i > array.length && array.length != 1){
					hash_map.put(j, values);
					for (int k = 0; k < array.length; k++){
						left_over_values.add(array[k]);
						array = removeElement(array, k);
					}
				}	
				else if (array.length == 1){
					values.add(array[0]);
					array = removeElement(array, 0);
				}
			}
			hash_map.put(j, values);
		}
		
		for (int j = 0; j < hash_map.size_of(); j++) {
			List<Integer> value = hash_map.get(j);
			System.out.println(value);
		}
		System.out.println("Number of comparisons searching for the number 10: " + search_map(10, hash_map)); 
		System.out.println();
		System.out.println("Number of comparisons searching for the number 80: " + search_map(80, hash_map)); 
		System.out.println();
		System.out.println("Number of comparisons searching for the number 62: " + search_map(62, hash_map)); 
		System.out.println();
		System.out.println("Number of comparisons searching for the number 37: " + search_map(37, hash_map)); 
		System.out.println();
		System.out.println("Number of comparisons searching for the number 90: " + search_map(90, hash_map)); 
		System.out.println();
		System.out.println("Number of comparisons searching for the number 79: " + search_map(79, hash_map)); 
		System.out.println();
		System.out.println("Number of comparisons searching for the number 41: " + search_map(41, hash_map)); 
		System.out.println();
		System.out.println("Number of comparisons searching for the number 29: " + search_map(29, hash_map)); 
		System.out.println();
		System.out.println("Number of comparisons searching for the number 17: " + search_map(17, hash_map)); 
		System.out.println();
		System.out.println("Number of comparisons searching for the number 3: " + search_map(3, hash_map)); 
		System.out.println();
	}
	public static int search_map(int value_to_find, HashMap hash_map) {
		int count = 1;

		for (int j = 0; j < hash_map.size_of(); j++) {
			List<Integer> value = hash_map.get(j);
			if (value.contains(value_to_find)) {
				return count;
			}

			else {
				count += 1;
			}
		}
		return count;
	}
	public static int[] removeElement(int[] original_array, int element) {
		int[] n = new int[original_array.length - 1];
		
		System.arraycopy(original_array, 0, n, 0, element);
		System.arraycopy(original_array, element + 1, n, element, original_array.length
				- element - 1);
		
		return n;
	}
}
