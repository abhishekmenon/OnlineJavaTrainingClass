package April23;

import java.io.*;
import java.util.*;
import java.lang.Cloneable;

public class Plant implements Cloneable{
	String name;
	int height;
	int leaves;

	public Plant(String s, int h, int l) {
    	name = s;
    	height = h;
    	leaves = l;
	}

	public String toString() {
    	return "Name: " + name + ", Height: " + height + ", Leaves: " + leaves;
	}

	public static void main(String[] args) throws CloneNotSupportedException{
    	// Creating an object
    	Plant p1 = new Plant("Tree", 10, 100);
    	System.out.println("Plant p1: " + p1);

    	// Creating clone of the object p1
    	Plant p2 = (Plant) p1.clone();
    	System.out.println("Clone of p1: " + p2);
	}
}



