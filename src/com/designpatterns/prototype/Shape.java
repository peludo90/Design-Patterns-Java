package com.designpatterns.prototype;

public abstract class Shape implements Cloneable {

	private int id;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object copy() {
		Shape clone = null;

		try {
			clone = (Shape) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;

	}

}
