package April23;

public class IIBSExample{
	    // Instance Initialization Block - 1
	
	    {
	   	 System.out.println("IIB1 block");
	    }
	    // Instance Initialization Block - 2
	    
	    {
	   	 System.out.println("IIB2 block");
	    }
	    IIBSExample() { System.out.println("Constructor Called"); }

	    // Instance Initialization Block - 3
	    {
	   	 System.out.println("IIB3 block");
	    }

	    // main function
	    public static void main(String[] args)
	    {
	    	IIBSExample a = new IIBSExample();
	    }
	}




