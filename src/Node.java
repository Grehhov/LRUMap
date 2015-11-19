
public class Node<TValue, TKey> {
	TValue value;
	TKey prev;
	TKey next;
	
	Node(TValue value, TKey prev) {
		this.value = value;
		this.prev = prev;
		this.next = null;
	}
}
