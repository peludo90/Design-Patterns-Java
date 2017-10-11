package com.designpatterns.composite;

interface BranchComponent extends BaseComponent {

	public void add(BranchComponent component);

	public void remove(BranchComponent component);

	public BaseComponent getComponent(int componentIndex);
	
}
