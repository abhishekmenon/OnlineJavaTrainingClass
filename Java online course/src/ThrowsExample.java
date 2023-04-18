import java.io.IOException;

//class Example_Throw {
//    //declare exception using throws in the method signature
//  void testMethod(int num) throws IOException, ArithmeticException{
//     if(num==1)
//        
//     else
//        throw new ArithmeticException("ArithmeticException");
//  }
//}
public class ThrowsExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try{
		     //this try block calls the above method so handle the exception
		     //Example_Throw obj=new Example_Throw();
		     throw new IOException("IOException Occurred");
		}
		catch(Exception ex){
			 System.out.println("This is inside try-catch");
			 try {
			 throw new ArithmeticException("ArithmeticException");
			 }
			 catch (Exception e) {
				System.out.println("This is inside the catch nested try-catch");
			}
		     System.out.println(ex.getMessage());
		}
	}
}


