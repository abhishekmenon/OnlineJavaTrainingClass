
public class ExceptionExample {

	public static void main(String[] args) {
		int myArray[]=new int[5];
		try{	
            System.out.println("try Block:: Begin"); 
           //0...4 	
            System.out.println("Array element 10 : " + myArray[4]);
            myArray[4]=10/0;	
            
            
        }
        //multiple catch blocks
        catch(ArithmeticException e) 
        { 
            System.out.println("Arithmetic Exception :: Divide by zero!!"); 
        }
        catch(ArrayIndexOutOfBoundsException e) 
        { 
            System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds"); 
        }
        catch(Exception e) 
        { 
            System.out.println("Exception :: " + e.getMessage ()); 
        }   	
        System.out.println("rest of the code");
        myArray[4]=10/0;
        
    } 

}


