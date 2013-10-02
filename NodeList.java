public class NodeList {
	public SListNode head;
	public int size;

	public SList() {
    	size = 0;
    	head = null;
  	}

  	public boolean isEmpty() {
    	return size == 0;
  	}

  	public int length() {
    	return size;
  	}

  	public void insertFront(Node n) {
	    head = new SListNode(obj, head);
	    size++;
	}

	public void insertEnd(Object obj) {
	    if (head == null) {
	      head = new SListNode(obj);
	    } else {
	      SListNode node = head;
	      while (node.next != null) {
	        node = node.next;
	      }
	      node.next = new SListNode(obj);
	    }
	    size++;
	}

	public String toString() {
	    int i;
	    Object obj;
	    String result = "[  ";

	    SListNode cur = head;

	    while (cur != null) {
	      obj = cur.item;
	      result = result + obj.toString() + "  ";
	      cur = cur.next;
	    }
	    result = result + "]";
	    return result;
  	}
}