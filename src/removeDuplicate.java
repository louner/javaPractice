
public class removeDuplicate {

	static void removeduplicate(Node head)
	{
		Node curNode = head;
		while (curNode != null) {
			remove(curNode, curNode.val);
		}
	}
	
	static void remove(Node head, int value)
	{
		Node ptrNode = head.next, lasNode = head;
		while(ptrNode != null)
		{
			if(ptrNode.val == value)
				lasNode.next = ptrNode.next;
		else
			lasNode = lasNode.next;
		
			ptrNode = ptrNode.next;
		}
	}
	
	public static void main(String[] args)
	{
		int[] values = new int[]{1, 2, 3, 3};
		Node node = new Node(values);
		
		removeduplicate(node);
		assert node.val == 1;
		assert node.next.val == 2;
		assert node.next.next.val == 3;
	}
}
