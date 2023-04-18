package April17;

public class Student2 implements Comparable{
	//data members
	private String name;
	private String rollNo;
	private int age;
 
	//no-argument constructor
	public Student2(){
 
	}
 
	//argument cnstructor
	public Student2(String name, String rollNo, int age){
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 
	//Method for sorting logic
	//s1 s2
	public int compareTo(Object obj){  
		Student2 student=(Student2)obj;  
		return (this.name).compareTo(student.name); 
	}  
 
}

