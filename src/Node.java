public class Node {
	
	int val;
	Node next;
	
	Node(int value)
	{
		val = value;
		next = null;
	}
	
	Node(int[] values)
	{
		Node curNode = new Node(values[0]);
		Node head = curNode, node;
		
		for(int i = 1; i < values.length; i++)
		{
			node = new Node(values[i]);
			curNode.next = node;
			curNode = curNode.next;
		}
		
		this.val = head.val;
		this.next = head.next;
	}
	
	boolean confirm(int[] values)
	{
		Node curnNode = this;
		int i;
		for(i = 0; i < values.length && curnNode != null; i++, curnNode=curnNode.next)
		{
			if(curnNode.val != values[i])
				break;
		}
		
		if(curnNode == null && i == values.length)
			return true;
		
		else
			return false;
	}
		
	public static void main(String[] args)
	{
		int[] values = new int[]{1,2,3};
		Node head = new Node(values);
		
		assert head.val == 1;
		assert head.next.val == 2;
		assert head.next.next.val == 3;
		
		assert head.confirm(values);
	}
	
}
