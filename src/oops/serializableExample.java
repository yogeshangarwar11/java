package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializableExample {

	public static void main(String[] args) {
		try {
			man m1 = new man(22,"yogesh");
			man m2 = new man(21,"vijay");
			man m3 = new man(267,"naveen");
			FileOutputStream z = new FileOutputStream("serializable.txt");
			ObjectOutputStream x = new ObjectOutputStream(z);
			x.writeObject(m1);
			x.writeObject(m2);
			x.writeObject(m3);
			x.flush();
			x.close();
			System.out.println("completed serialization successfully");
		} catch(Exception e){
			System.out.println(e);
		}
		try {
			FileInputStream q = new FileInputStream("serializable.txt");
			ObjectInputStream c = new ObjectInputStream(q);
			man t1 = (man)c.readObject();
			man t2 = (man)c.readObject();
			man t3 = (man)c.readObject();
			System.out.println(t1.rollno+" "+t1.name);
			System.out.println(t2.rollno+" "+t2.name);
			System.out.println(t3.rollno+" "+t3.name);
			c.close();
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
