public class LRUMap<TKey, TValue> implements LRU<TKey, TValue>{
	private LinkedList<TKey, TValue> list = new LinkedList<TKey, TValue>();;
	
	public void addOfUpdate(TKey key, TValue value) {
		if (list.containsKey(key)) {
			list.remove(key);
		}
		list.add(key, value);
	}
	
	public int size() {
		return list.size();
	}
	
	public TValue find(TKey key) {
		TValue value = list.get(key);
		if (value != null) {
			list.remove(key);
			list.add(key, value);
		}
		return value;
	}
	public void removeLRU()	{
		if(list.oldest != null) {
			list.remove(list.oldest);
		}
	}
}