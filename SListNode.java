public class Node {
	protected Object item;
	protected Node neighbor;

	SListNode(Object obj, SListNode next) {
    	item = obj;
    	this.neighbor = next;
 	}
 	SListNode(Object obj) {
    	this(obj, null);
  	}
}