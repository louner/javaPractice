import tools.LimitedQueue;

public class findLastKNode {
	
	static Integer findlastknode(Node head, int k)
	{
		LimitedQueue<Integer> Q = new LimitedQueue(k);
		Node curNode = head;
		
		while(curNode != null)
		{
			Q.add(curNode.val);
			curNode = curNode.next;
		}
		
		return Q.element();
	}
	
	
	public static void main(String[] args){
		
		int k = 6;
		int[] values = new int[]{0,1,2,3,4,5,6,7,8,9};
		Node node = new Node(values);

		assert findlastknode(node, k) == 4;
	}
}
