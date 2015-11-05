import java.util.Iterator;
import java.util.Collection;

public class NumberList<E> implements Collection<E> {
	private Long[] x;
	/** Constructs an empty number list. */
    public NumberList(){
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        x = new Long[0];
    }


    /** Constructs a number list from an array of Longs. */
    public NumberList( Long[] l ){
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        x = l;
    }
    
    /** Increases by one the number of instances of the given element in this collection. */
    public boolean add ( Object obj ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	Long[] c = new Long[x.length + 1];
    	int i = 0;
    	while(x.length > i)
        {
        	c[i] = x[i];
        	i++;
        }
    	c[i] = (Long)obj;
    	x = c;
    	if(this.contains(obj))
    	return true;
    	else
    		return false;
    }
    

    /** Adds all of the elements of the given number list to this one. */
  
 

    /** Removes all of the elements from this collection. */
    public void clear () {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        x=new Long[0];
    }
 

    /** Returns true iff this number list contains at least one instance of the specified element. */
    public boolean contains ( Object obj ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	if(!(this.isEmpty()))
    	{
    		int i = 0;
    		while(i < x.length)
    		{
    			if(x[i] == (long)obj)
    				return true;
    			i++;
    		}
    	}
    		return false; 
    }
 


    /** Returns true iff this number list contains at least one instance of each element 
        in the specified list. Multiple copies of some element in the argument do not
        require multiple copies in this number list. */
    public boolean containsAll ( Collection<?> c ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        for(Object k: c)
        {
        	if(!(this.contains(k)))
        		return false;
        }
        return true;
    }
 
 


    /** Compares the specified object with this collection for equality. */
    public boolean equals (Object obj ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	int i = 0;
        for(Long k: ((NumberList<E>)obj).toArray())
        {
        	if(x[i] != k)
        		return false;
        	i++;
        }
        return true;
    }
 



    /** Returns the hashcode value for this collection. */
    public int hashCode () {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	return this.hashCode();
    }



    /** Returns true if this collection contains no elements. */
    public boolean isEmpty () {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        for(int i = 0; i < x.length; i++)
        {
        	if(x[i] != null)
        		return false;
        }
        return true;
    }



    /** Returns an iterator over the elements in this collection. Replicated elements should
        be "iterated over" just once. */
    public java.util.Iterator<E> iterator() {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	return this.iterator();
    }



    /** Removes a single instance of the specified element from 
        this collection, if it is present. */
    public boolean remove ( Object obj ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	if(this.contains((Long)obj))
        {
    		boolean q = true;
    		Long[] u = new Long[x.length];
    		for(int i=0;i<x.length;i++)
    		{
    			u[i]=new Long(999999999);
    		}
        	for(int i = 0; i < x.length; i++)
        	{
        		if(!q&&x[i]==(long)obj)
        			u[i]=x[i];
        		if(x[i] != (long)obj)
        		{
        			u[i]=x[i];
        		}
        		else
        		{
        			q=false;
        		}
        		
        		
        	}
        	NumberList<E> k = new NumberList<E>();
        	for(Object c:u)
        	{
        		if(((Long)c).longValue()!=999999999)
        			k.add(c);
        	}
        	x=k.toArray();
        	return true;
        }
        return false;
        
    }
    public boolean removeAll ( Object obj ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	if(this.contains((Long)obj))
        {
    		Long[] u = new Long[x.length];
    		for(int i=0;i<x.length;i++)
    		{
    			u[i]=new Long(999999999);
    		}
        	for(int i = 0; i < x.length; i++)
        	{
        		boolean d = true;
        		if(x[i] != (long)obj && d)
        		{
        			u[i]=x[i];
        		}
        		else
        		{
        			d = false;
        		}
        	}
        	NumberList<E> k = new NumberList<E>();
        	for(Object c:u)
        	{
        		if(((Long)c).longValue()!=999999999)
        			k.add(c);
        	}
        	x=k.toArray();
        	return true;
        }
        return false;
        
    }



    /** Removes all of this collection's elements that are also contained 
        in the specified collection. */
    public boolean removeAll ( Collection<?> c ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        for(Object t: c)
        {
        	while(this.contains(t))
        		this.remove(t);
        }
        return true;
    }




	/** Retains only the elements in this collection that are contained in the specified collection. 
		 In other words, removes from this collection all of its elements that are not contained in the 
		 specified collection. */
	public boolean retainAll ( Collection<?> c ) {
		NumberList<E> y = new NumberList<E>();
		for(int i = 0; i < x.length; i++)
		{
			for(Object k: c)
			{
				if(x[i] == (long)k)
				{
					y.add(k);
				}
				
			}
		}
		x = y.toArray();
		if(this.size() == y.size())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}


    /** Returns the number of elements in this number list, including duplicates. */
    public int sizeIncludingDuplicates () {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        return x.length;
    }
    
    

    /** Returns a NumberList[] containing all of the elements in this collection, not including duplicates. */
    public java.lang.Long[] toArray() {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        return x;
    }



    /** Not supported for this class. */
   // public NumberList[] toArray ( Object[] obj ) {
   //     throw new UnsupportedOperationException();
    //}




    /** Returns the number of elements in this number list, not including duplicates. */
    public int size () {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	NumberList<E> k = new NumberList<E>(x);
    	for(int i = 0; i < x.length; i++)
    	{
    		k.add(x[i]);
    	}
    	for(Long v: x)
    	{
    		boolean d = false;
    				for(Long t: k.toArray())
    				{
    					if(d && v == t)
    						k.remove(t);
    					if(v == t)
    						d = true;
    				}
    	}
    	return k.toArray().length;
    }

    /** Returns the number of instances of the given element in this number list. */
    public int count ( Object obj ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        int counts = 0;
        for(Long i: x)
        {
        	if((Long)obj == i)
        		counts++;
        }
        return counts;
    }
    

    
    /** This returns a stringy version of this number list. */
    public String toString () { // overrides Object.toString()
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	String s = "";
        for(Long n: x)
        {
        	s += "[" + n + "]";
        }
        return s;
    }


    
    /** This so-called "static factory" returns a new number list comprised of the numbers in the specified array.
        Note that the given array is long[], not Long[]. */
    public static NumberList<?> fromArray ( long[] l ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        Long[] z = new Long[l.length];
        for(int i = 0; i < z.length; i++)
        {
        	z[i] = new Long(l[i]);
        }
        return new NumberList<>(z);
    }

    
    /** This main method is just a comprehensive test program for the class. */
    public static void main ( String[] args ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
    	NumberList<Long> t = new NumberList<Long>(); 
    	for(String s: args)
    	{
    		long b = Long.parseLong(s);
    		{
    			if(b == (long) b)
    			{
    				t.add((long) b);
    			}
    			else
    			{
    				System.out.println("Wrong input");
    				throw new IllegalArgumentException(); 
    			}
    		}
    	}
    	
    }


	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		for(Object k: c)
    	{
    		this.add((Long)k);
    	}
    	return true;
	}
    
}
