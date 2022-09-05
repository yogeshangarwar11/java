package oops;

public class encap {
	private int id;
	private String name;
	private long mobileno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id > 0) {
		this.id = id;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
}
