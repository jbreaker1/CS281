import java.util.LinkedList;

public class LinkedDeque{
		// TODO Auto-generated method stub
		private Node leftEnd;
		private Node rightEnd;
		private int length;
		public LinkedDeque () // default constructor
		{
			leftEnd = null;
			rightEnd = null;
			length = 0;
		}
		public void insertLeft ( Object o )
		{
			if(isEmpty())
			{
				leftEnd = new Node(null, null, o);
				rightEnd = leftEnd;
				length++;
			}
			else
			{
				Node oldLeftEnd = leftEnd;
				leftEnd = new Node(null, leftEnd, o);
				oldLeftEnd.setLeft(leftEnd);
				length++;
			}
		}
		public void insertRight ( Object o )
		{
			if(isEmpty())
			{
				leftEnd = new Node(null, null, o);
				rightEnd = leftEnd;
				length++;
			}
			else
			{
				Node oldRightEnd = rightEnd;
				rightEnd = new Node(rightEnd, null, o);
				oldRightEnd.setRight(rightEnd);
				length++;
			}
		}
		public void setRight(Node n, Node n2)
		{
			n = new Node(n,n2,n.getValue());
		}
		public void deleteLeft ()
		{
			if(isEmpty())
			{
				throw new IllegalArgumentException();
			}
			else if(size() == 1)
			{
				leftEnd = null;
				rightEnd = leftEnd;
			}
			else
			{
				leftEnd = leftEnd.getRight();
				leftEnd.setLeft(null);
				length--;
			}
		}
		public void deleteRight ()
		{
			if(size() == 0)
			{
				throw new IllegalArgumentException();
			}
			else if(size() == 1)
			{
				leftEnd = null;
				rightEnd = leftEnd;
			}
			else
			{
				rightEnd = rightEnd.getLeft();
				rightEnd.setRight(null);
				length--;
			}
		}
		public Object left () // returns the left element without modifiying the deque
		{
			return leftEnd.getValue();
		}
		public Object right () // returns the right element without modifiying the deque
		{
			return rightEnd.getValue();
		}
		public int size ()
		{
			return length;
		}
		public String toString () // returns [obj][obj]...[obj]
		{
			String k = "";
			Node temp = leftEnd;
			while(temp != null)
			{
				k += "[" + temp.getValue() + "]";
				temp = temp.getNext();
			}
			return k;
		}
		public boolean isEmpty()
		{
			return length == 0;
		}
		public static void main ( String[] args ) // runs a comprehensive set of unit tests
		{
			LinkedDeque x = new LinkedDeque();
			Node s = new Node(null, null, "x");
			x.insertLeft(s);
			System.out.println(x);
			System.out.println(x.right());
			System.out.println(x.left());
			Node y = new Node(null, null, "y");
			Node z = new Node(null, null, "z");
			x.insertLeft(y);
			System.out.println(x);
			x.insertRight(z);
			System.out.println(x);
			Node w = new Node(null, null, "w");
			x.insertRight(w);
			System.out.println(x);
			System.out.println(x.right());
			System.out.println(x.left());
			System.out.println(x.size());
			x.deleteLeft();
			System.out.println(x);
			x.deleteRight();
			System.out.println(x);
			System.out.println(x.size());
			x.deleteLeft();
			x.deleteRight();
			x.deleteRight();
			System.out.println(x);
		}
	}


