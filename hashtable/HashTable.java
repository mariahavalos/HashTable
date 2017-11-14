package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTable {

	public static void main(String[] args) {
		int[] array = Array.array();
		HashMap hash_map_small = new HashMap(7);
		HashMap hash_map_medium = new HashMap(51);
		HashMap hash_map_large = new HashMap(151);

		Hashing.do_hash(hash_map_small);
		Hashing.do_hash(hash_map_medium);
		Hashing.do_hash(hash_map_large);
	}
}
