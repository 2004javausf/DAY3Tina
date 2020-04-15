package com.revature.beans;

public class Cat {
	private String type;
	private int weight;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Cat [type=" + type + ", weight=" + weight + "]";
	}
}
