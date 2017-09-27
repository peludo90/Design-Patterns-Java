package com.designpatterns.bridge;

public interface ListInterface {

	void addItem(String item);

	void removeItem(String item);

	int getCount();

	String getItem(int index);

	boolean allowRepeated();

}
