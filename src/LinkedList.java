import java.util.HashMap;

public class LinkedList<TKey, TValue> {
	private HashMap<TKey, Node<TValue, TKey>> list = new HashMap<TKey, Node<TValue, TKey>>();
	TKey newest = null;
	TKey oldest = null;
	
	public void add(TKey key, TValue value) {
		if (newest != null){
			list.get(newest).next = key;
		} else {
			oldest = key;
		}
		list.put(key, new Node<TValue, TKey>(value, newest));
		newest = key;
	}
	
	public void remove(TKey key) {
		Node<TValue, TKey> node = list.get(key);
		if (node != null){
			list.remove(key);
			if (node.prev != null){
				list.get(node.prev).next = node.next;
			} else {
				oldest = node.next;
			}
			if (node.next != null) {
				list.get(node.next).prev = node.prev;
			} else {
				newest = node.prev;
			}
		}
	}
	
	public boolean containsKey(TKey key) {
		return list.containsKey(key);
	}
	
	public Integer size(){
		return list.size();
	}
	
	public void printItem(){
		TKey item = oldest;
		while (item != null) {
			System.out.println(item + " " + list.get(item).value);
			item = list.get(item).next;
		}
	}
	
	public TValue get(TKey key) {
		if (list.containsKey(key)) {
			return list.get(key).value;
		}
		return null;
	}
}
