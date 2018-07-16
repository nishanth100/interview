package hard;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUCache {

	private static int capacity;
	private static LinkedHashMap<Integer, Integer> map;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.map = new LinkedHashMap<>();
	}
	
	public int get(int key) {
		
		Integer val = this.map.get(key);
		if(val == null) {
			return -1;
		}else {
			this.put(key,val);
		}
		return val;
	}

	private void put(int key, Integer val) {
		if(this.map.containsKey(key)) {
			this.map.remove(key);
		}else if(this.map.size() == capacity) {
			Iterator<Integer> it = map.keySet().iterator();
			it.next();
			it.remove();
		}
		this.map.put(key, val);
	}
	
	public static void main(String[] args) {
		LRUCache lru = new LRUCache(1);
		System.out.println(lru.map.get(2));
		lru.put(1, 1);
		lru.put(2, 2);
		System.out.println(lru.map.get(1));
		lru.put(3, 3);
		System.out.println(lru.map.get(2));
		lru.put(4, 4);
		System.out.println(lru.get(1));
		System.out.println(lru.get(3));
		System.out.println(lru.get(4));
	}
}

