package com.designpatterns.bridge;

public abstract class ListUsageBase {

	protected ListInterface listImpl;

	abstract String printList();

	public void setListImpl(ListInterface listImpl) {
		this.listImpl = listImpl;
	}

	public void addItem(String item) {
		if (listImpl != null)
			listImpl.addItem(item);
	}

	public void removeItem(String item) {
		if (listImpl != null)
			listImpl.removeItem(item);
	}

	public int getCant() {
		if (listImpl != null) {
			return listImpl.getCount();
		} else {
			return 0;
		}
	}

	public String getItem(int index) {
		if (listImpl != null)
			return listImpl.getItem(index);
		else
			return null;
	}

	public boolean allowRepeated() {
		if (listImpl != null)
			return listImpl.allowRepeated();
		else
			return false;
	}
}
