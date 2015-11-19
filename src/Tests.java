import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {
	
	@Test
	public void testOfAdd(){
		LRUMap<Integer, Integer> map = new LRUMap<Integer, Integer>();
		for(int i = 0; i < 100; i++) {
			map.addOfUpdate(i, i);
		}
		assert(map.size() == 100);
		assert(map.find(80) == 80);
		assert(map.find(99) == 99);
	}

	@Test
	public void testOfUpdate(){
		LRUMap<Integer, Integer> map = new LRUMap<Integer, Integer>();
		for(int i = 0; i < 100; i++) {
			map.addOfUpdate(i % 10, i);
		}
		assert(map.size() == 10);
		assert(map.find(0) == 90);
		assert(map.find(9) == 99);
	}
	
	@Test
	public void testOfFind(){
		LRUMap<Integer, Integer> map = new LRUMap<Integer, Integer>();
		for(int i = 0; i < 100; i++) {
			map.addOfUpdate(i, i + 10);
		}
		assert(map.find(0) == 10);
		assert(map.find(77) == 87);
		assert(map.find(99) == 109);
		assert(map.find(100) == null);
		assert(map.find(333) == null);
	}
	
	@Test
	public void testOfRemove(){
		LRUMap<Integer, Integer> map = new LRUMap<Integer, Integer>();
		for(int i = 0; i < 100; i++) {
			map.addOfUpdate(i, i + 10);
		}
		assert(map.size() == 100);
		for(int i = 0; i < 10; i++) {
			map.removeLRU();
		}
		assert(map.size() == 90);
		assert(map.find(0) == null);
		assert(map.find(10) == null);
		assert(map.find(11) == 21);
		assert(map.find(99) == 109);
		map.removeLRU();
		assert(map.size() == 89);
		assert(map.find(11) == 21);
		assert(map.find(12) == null);
	}
}
