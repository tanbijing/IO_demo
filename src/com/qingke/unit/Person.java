package com.qingke.unit;

public class Person {
	public String ID;
	public String name;
	public String salary;
	public String superID;
	public String Master;
	
	public Person(String iD, String name, String salary, String superID, String master) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.superID = superID;
		Master = master;
	}

	@Override
	public String toString() {
		return "ID=" + ID + ", name=" + name + ", salary=" + salary + ", superID=" + superID + ", Master="
				+ Master;
	}
}
