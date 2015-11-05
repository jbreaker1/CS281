import java.util.Arrays;

public class BaseConverter {
	public static long baseWanted = (long) 10;
	public static long baseGiven;
	
    /** This method attempts to validate the command-line arguments. If they're
        okay, it returns true; otherwise, it returns false. */
    public static boolean validArgs ( String[] args ) {
    	
        // YOUR CODE GOES HERE
    	if(args.length != 2 && args.length != 3)
    		return false;
    	
    	for(int i = 0; i < args[0].length(); i++)
    	{
    		String b = args[0].charAt(i) + "";
    		if(! ((b.equals("[")) || (b.equals("]")) || isLong(b)))
    			return false;
    	}
    	
    	if(!((args[0].charAt(args[0].length()-1) + "").equals("]")))
    		return false;
    		
    	long[] x = new long[numberOfDigits(args)];
    	int c = 0;
    	for(int i = 0; i < args[0].length(); i++)
    	{
    		String b = "";
    		if((args[0].charAt(i) + "").equals("["))
    		{
    			i++;
    			if((args[0].charAt(i) + "").equals("]"))
    				return false;
    			while(!(args[0].charAt(i) + "").equals("]"))
    			{
    				b += args[0].charAt(i) + "";
    				i++;
    			}
    		}
    		x[c] =  Long.parseLong(b); 
    		c++;
    	}
    	for(int k = 0; k < x.length; k++)
    	{
    		if(x[k] < 0)
    			return false;
    	}
    	
    	return true;
    }
    
    
    
    /** This method calls validArgs() to check the command-line arguments and, if they're valid, 
        it takes care of the conversion and outputs the result. */
    
    public static void main ( String[] args ) {
    	
        if ( ! validArgs ( args ) ) {
        	System.out.println("Wrong Input. Please try again :D");
            throw new IllegalArgumentException();
        }
        else {
        	if(args.length > 2)
        		baseWanted = Long.parseLong(args[2]);
        	baseGiven = Long.parseLong(args[1]);
    	    System.out.println(toBaseWanted(toBaseTen(args)));
        }
    }
    public static long toBaseTen( String[] args)
    {
    	long[] x = new long[numberOfDigits(args)];
    	int c = 0;
    	for(int i = 0; i < args[0].length(); i++)
    	{
    		String b = "";
    		if((args[0].charAt(i) + "").equals("["))
    		{
    			i++;
    			while(!(args[0].charAt(i) + "").equals("]"))
    			{
    				b += args[0].charAt(i) + "";
    				i++;
    			}
    		}
    		x[c] =  Long.parseLong(b); 
    		c++;
    	}
    	Long sum = (long) 0;
    	for(int i = 0; i < x.length; i++)
    	{
    		sum *= Long.parseLong(args[1]);
    		sum += x[i];
    	}
    	return sum;
    }
    
    public static int numberOfDigits(String[] args)
    {
    	int x = 0;
    	for(int i = 0; i < args[0].length(); i++)
    	{
    		if ((args[0].charAt(i) + "").equals("["))
    			x++;
    	}
    	return x;
    }
    
    public static String toBaseWanted(long args)
    {
    	String s = "";
    	if(args == 0)
    		return "[0]";
    	while(args != 0)
    	{
    		long remainder = args % baseWanted;
    		s = "[" + remainder + "]" + s;
    		args /= baseWanted;
    	}
    	return s;
    }
    public static boolean isLong(String s)
    {
    	try {
    		Long.parseLong(s);
    		return true;
    	}
    	catch (NumberFormatException nfe)
    	{
    		return false;
    	}
    }
}

