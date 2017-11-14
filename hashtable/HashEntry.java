package hashtable;

import java.util.ArrayList;
import java.util.List;

public class HashEntry {

	private int key;
	private List<Integer> value = new ArrayList();

	HashEntry(int key, List<Integer> value) {
		this.key = key;
		this.value = value;
	}

	public int get_key() {
		return key;
	}

	public List<Integer> get_value() {
		return value;
	}

}
