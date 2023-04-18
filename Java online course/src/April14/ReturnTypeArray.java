package April14;


//interface if0{
//	void v1();
//}
//
//interface if3 extends if0{
//	
//}
//interface if4 extends if0 {
//	
//}
//
//
//
//
//class if1 implements if0{
//	void v1(){
//		System.out.;
//	}
//}
//class if2 implements if0{
//	
//}

public class ReturnTypeArray {


		  
		  public static int[] doMultiplication(int[] arr) {
			for(int i=0;i<arr.length;i++) {
		  	arr[i] = arr[i] * 2;
			}
			return arr;
		  }
		  
		  public static void main (String[] args) {
			
			int myArray[] = {1,2,3,4,5};
			
			int[] multiplyArr = doMultiplication(myArray);
			
			System.out.println("Array multiply by 2 is - " );
				for(int i : multiplyArr) {
			  	System.out.print(i + " ");
				}
		  }
		




}
