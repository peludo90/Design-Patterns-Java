package com.designpatterns.bridge;

public class ListUsageNumbered extends ListUsageBase {

	@Override
	String printList() {
		if (listImpl != null) {
			String result = "";
			int size = listImpl.getCount();
			for (int i = 0; i < size; i++) {
				result += (size + 1) + ". " + listImpl.getItem(i) + "\n";

			}
			return result;

		} else {
			return null;
		}
	}

}
