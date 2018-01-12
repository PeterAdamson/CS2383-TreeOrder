//Author Peter Adamson

public class TreeOrder{

	public void execute(){
		Node node1 = new Node();
		node1.ID = 1;
		Node node2 = new Node();
		node2.ID = 2;
		Node node3 = new Node();
		node3.ID = 3;
		Node node4 = new Node();
		node4.ID = 4;
		Node node5 = new Node();
		node5.ID = 5;
		Node node6 = new Node();
		node6.ID = 6;
		Node node7 = new Node();
		node7.ID = 18;
		node1.Data = 12;
		node1.left = node2;
		node1.right = node3;
		node2.Data = 10;
		node2.parent = node1;
		node2.right = node4;
		node3.Data = 19;
		node3.parent = node1;
		node3.left = node5;
		node4.Data = 13;
		node4.parent = node2;
		node5.Data = 15;
		node5.parent = node3;
		node5.left = node6;
		node5.right = node7;
		node6.Data = 14;
		node6.parent = node5;
		node7.Data = 18;
		node7.parent = node5;
		preorder(node1);
		inorder(node1);
		postorder(node1);
	}

	public static void main(String[] args){
		TreeOrder test = new TreeOrder();
		test.execute();
	}

	public static void preorder(Node root){
		if(root != null){
			System.out.println(root.Data);
			preorder(root.left);
			preorder(root.right);
		}
	}

	public static void inorder(Node root){
		if(root != null){
			inorder(root.left);
			System.out.println(root.Data);
			inorder(root.right);
		}
	}

	public static void postorder(Node root){
		if(root != null){
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.Data);
		}
	}

	private class Node{
		int ID;
		int Data;
		Node parent;
		Node left;
		Node right;
	}

}
