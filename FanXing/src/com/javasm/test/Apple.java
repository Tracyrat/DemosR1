package com.javasm.test;

public class Apple<T> {

	private T weight;
	private Double price;
	public Apple(T weight) {
		super();
		this.weight = weight;
	}

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public T getWeight() {
		return weight;
	}

	public void setWeight(T weight) {
		this.weight = weight;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((price == null) ? 0 : price.hashCode());
//		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}
	
	
	
}
