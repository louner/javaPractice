public class deleteThisNode {
	
	static void deletethisnode(Node toBedelet)
	{
		Node next =  toBedelet.next;
		toBedelet.val = next.val;
		toBedelet.next = next.next;
	}

	public static void main(String[] args)
	{
		int[] values = new int[]{1,2,3,4};
		Node node = new Node(values);
		Node toBeDelete = node.next.next;
		
		assert toBeDelete.val == 3;
		
		deletethisnode(toBeDelete);
		assert node.confirm(new int[]{1,2,4});
	}
}
