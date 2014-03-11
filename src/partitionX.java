
public class partitionX {
	
	static void swapValue(Node node1, Node node2)
	{
		int tmp = node1.val;
		node1.val = node2.val;
		node2.val = tmp;
	}
	
	static void partitionx(Node node, int x)
	{
		Node firstLargerOrEqual = null;
		Node current = node, last = node;
		
		for(; current != null; current = current.next)
			if(current.val >= x)
			{
				firstLargerOrEqual = current;
				break;
			}
		
		for(; current != null; current = current.next)
			if(current.val < x)
			{
				swapValue(firstLargerOrEqual, current);
				firstLargerOrEqual  = firstLargerOrEqual.next;
			}
	}

	public static void main(String[] args)
	{
		int x = 10;
		Node node = new Node(new int[]{11, 12, 13, 1, 2, 3});
		
		partitionx(node, x);
		assert node.confirm(new int[]{1,2,3,11,12,13});
		
		node = new Node(new int[]{1,11,2,12,3,13});
		partitionx(node, x);
		assert node.confirm(new int[]{1,2,3,12,11,13});
	}
}
