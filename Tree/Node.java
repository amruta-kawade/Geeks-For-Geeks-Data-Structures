package Tree;


public class Node {
	Node right;
	Node left;
	int data;
	boolean rightThread;
	
	public Node(int data) {
		super();
		this.data = data;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public boolean isRightThread() {
		return rightThread;
	}
	public void setRightThread(boolean rightThread) {
		this.rightThread = rightThread;
	}
}
