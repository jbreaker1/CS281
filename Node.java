
public class Node {
	private Node left;
	private Node right;
	private Object data;
	public Node()
	{
		left = null;
		right = null;
	}
	public Node(Node left1, Node right1, Object data1)
	{
		left = left1;
		right = right1;
		data = data1;
	}
	public void add(Object k)
	{
		Node n = new Node(null, left, k);
		left = n;
	}
	public boolean hasNext()
	{
		if(left.hasNext())
			return true;
		else
			return false; 
	}
	public Node getRight()
	{
		return right;
	}
	public Node getLeft()
	{
		return left;
	}
	public Object getValue()
	{
		return data;
	}
	public static void main(String[] args)
	{
		
	}
	public String toString()
	{
		String s = "";
		s = (String) data;
		return s;
	}
	public Node getNext() {
		// TODO Auto-generated method stub
		return right;
	}
	public void setRight(Node n)
	{
		this.right = n;
	}
	public void setLeft(Node n)
	{
		this.left = n;
	}
}
