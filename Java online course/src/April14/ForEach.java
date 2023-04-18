package April14;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strArray[] = {"Python", "Java", "C++", "C", "PHP"};
		
		int arr1[]= {1,3,4,5,23,5,9};

		// using for-each loop
//		for(String i : strArray) {
//				System.out.println(i);
//		}
		
		int count=0;
		for(int i:arr1) {
			if(count==3) {
				System.out.println(i);
				break;
			}
			
			count++;
		}


	}

}
