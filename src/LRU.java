public interface LRU<TKey, TValue> {
	public void addOfUpdate(TKey key, TValue value);
	public int size();
	public TValue find(TKey key);
	public void removeLRU();	
}
