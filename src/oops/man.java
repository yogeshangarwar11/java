package oops;

import java.io.Serializable;

public class man implements Serializable {
	long rollno;
	String name;
    public man(long rollno,String name) {
    	this.rollno=rollno;
    	this.name=name;
    }
}
