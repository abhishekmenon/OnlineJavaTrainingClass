package April21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{

    transient String name;
    transient int age;

    public Person(String name, int age) {
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
}
public class SerialisationExample {

	    public static void main(String[] args) {
	        Person person = new Person("John", 88);
	        System.out.println("Original Object: " + person);

	        try {
	            FileOutputStream fos = new FileOutputStream("person.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(person);
	            oos.close();
	            fos.close();
	            System.out.println("Person object serialized successfully");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        person.setName("Jane");
	        person.setAge(25);
	        System.out.println("Modified Object: " + person);

	        try {
	            FileInputStream fis = new FileInputStream("person.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            Person deserializedPerson = (Person) ois.readObject();
	            ois.close();
	            fis.close();
	            System.out.println("Person object deserialized successfully");
	            System.out.println("Deserialized Object: " + deserializedPerson);
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}



