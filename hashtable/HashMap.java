package hashtable;

import java.util.ArrayList;
import java.util.List;

public class HashMap {

	public int size_of_table;
	HashEntry[] table;

	HashMap(int size_of_table) {
		this.size_of_table = size_of_table;
		table = new HashEntry[size_of_table];

		for (int i = 0; i < size_of_table; i++) {
			table[i] = null;
		}
	}

	public List<Integer> get(int key) {
		int hash = (key % size_of_table), count = 0;

		while (table[hash] != null && table[hash].get_key() != key) {
			hash = (hash + 1) % size_of_table;
			count += 1; 
		}

		if (table[hash] == null) {
			List<Integer> empty = new ArrayList();
			return empty;
		}

		else {
			return table[hash].get_value();
		}

	}

	public void put(int key, List<Integer> value) {
		int hash = (key % size_of_table);
		
		while (table[hash] != null && table[hash].get_key() != key) {
			hash = (hash + 1) % size_of_table;
		}

		table[hash] = new HashEntry(key, value);

	}

	public int size_of() {
		return table.length;
	}

}