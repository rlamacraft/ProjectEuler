public class treeNode {
	public int leftChild;
	public int rightChild;
	public int leftParent;
	public int rightParent;
	public int value;
	public int Cvalue;
	
	public treeNode(int leftParent, int rightParent,int value,int leftChild,int rightChild) {
		this.leftParent = leftParent;
		this.rightParent = rightParent;
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
}
