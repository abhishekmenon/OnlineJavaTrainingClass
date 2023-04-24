package April21;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


class Person8 implements Externalizable {
		private String name;
		private int age;

		public Person8() {
	    	// Required default constructor for Externalizable interface
		}

		public Person8(String name, int age) {
	    	this.name = name;
	    	this.age = age;
		}

		public void setName(String name) {
	    	this.name = name;
		}

		public void setAge(int age) {
	    	this.age = age;
		}

		public String toString() {
	    	return "Name: " + name + ", Age: " + age;
		}

		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
	    	out.writeUTF(name);
	    	out.writeInt(age);
		}

		@Override
		public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	    	name = in.readUTF();
	    	age = in.readInt();
		}
	}

	public class Externalisation{
		public static void main(String[] args) {
//	    	Person8 person = new Person8("John", 30);
//	    	System.out.println("Original Object: " + person);
//
//	    	try {
//	        	FileOutputStream fos = new FileOutputStream("person.ser");
//	        	ObjectOutputStream oos = new ObjectOutputStream(fos);
//	        	person.writeExternal(oos);
//	        	oos.close();
//	        	fos.close();
//	        	System.out.println("Person object externalized successfully");
//	    	} catch (IOException e) {
//	        	e.printStackTrace();
//	    	}

	    	Person8 modifiedPerson = new Person8("Jane", 25);
	    	System.out.println("Modified Object: " + modifiedPerson);

	    	try {
	        	FileInputStream fis = new FileInputStream("person.ser");
	        	ObjectInputStream ois = new ObjectInputStream(fis);
	        	Person8 deserializedPerson = new Person8();
	        	deserializedPerson.readExternal(ois);
	        	ois.close();
	        	fis.close();
	        	System.out.println("Person object deserialized successfully");
	        	System.out.println("Deserialized Object: " + deserializedPerson);
	    	} catch (IOException | ClassNotFoundException e) {
	        	e.printStackTrace();
	    	}
		}
	}


