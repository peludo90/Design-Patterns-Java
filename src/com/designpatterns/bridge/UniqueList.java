package com.designpatterns.bridge;

import java.util.ArrayList;
import java.util.List;

public class UniqueList implements ListInterface {

	private List<String> list;

	public UniqueList() {
		list = new ArrayList<>();
	}

	@Override
	public void addItem(String item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeItem(String item) {
		if (list.contains(item))
			list.remove(item);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public String getItem(int index) {
		if (index < list.size())
			return list.get(index);
		else
			return null;
	}

	@Override
	public boolean allowRepeated() {
		return false;
	}

}
