package com.designpatterns.bridge;

public class ListUsageLines extends ListUsageBase {

	@Override
	String printList() {
		if (listImpl != null) {
			String result = "";
			int size = listImpl.getCount();
			for (int i = 0; i < size; i++) {
				result += "- " + listImpl.getItem(i) + "\n";

			}
			return result;
		} else {
			return null;
		}
	}

}
