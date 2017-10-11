package com.designpatterns.composite;

import java.util.List;

public class BranchCompImpl implements BranchComponent {

	private List<BaseComponent> listComponents;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(BranchComponent component) {
		// TODO Auto-generated method stub
		listComponents.add(component);
	}

	@Override
	public void remove(BranchComponent component) {
		// TODO Auto-generated method stub
		listComponents.remove(component);
	}

	@Override
	public BaseComponent getComponent(int componentIndex) {

		return listComponents.get(componentIndex);
	}

}
