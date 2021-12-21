class Node
{
	int data;
	Node left, right;
	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}
public class mst
{
	Node root;

	int minDepth()
	{
		return minDepth(root);
	}
	int minDepth(Node root)
	{
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;

        int left_depth = root.left != null ? 
            minDepth(root.left) : Integer.MAX_VALUE;
        
        int   right_depth = root.right != null ? 
            minDepth(root.right) : Integer.MAX_VALUE;
	
		return 1+ Math.min(left_depth,right_depth);
	}

	public static void main(String args[])
	{
		mst tree = new mst();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.right = new Node(8);
		tree.root.left.right.right = new Node(9);
		tree.root.right.right.left = new Node(10);
		tree.root.right.right.right = new Node(11);
		tree.root.left.left.right.right = new Node(12);
		
		

		System.out.println("The minimum depth of binary tree is : " + tree.minDepth());
	}
}
