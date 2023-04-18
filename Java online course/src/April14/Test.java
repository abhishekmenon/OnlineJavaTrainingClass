package April14;

class Student {
	int id;
	String name;
	  Student(int id, String name) {
		  this.id=id;
		  this.name=name;
		
	  }
	  void getData() {
		  System.out.println("Student ID is "+ id + " and name is "+ name );
	  }
	  
}
public class Test {
	  public static void main (String[] args) {
		// declaring an array of Object
			Student obj[] = new Student[3];    
			obj[0] = new Student(1,"Bharat");
			obj[1] = new Student(5,"Vivaan");
			obj[2] = new Student(6,"Smith");
			
		
		for(Student i:obj) {
			System.out.println(i.id+" "+i.name);
		}
		
		
//		for(int i=0;i<3;i++) {
//			obj[i].getData();
//			
//		}
	  }
	}

