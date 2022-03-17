package com.sample.srr;

public class Laptop implements Comparable<Laptop> {

	private String brand;
	private int price;
	private int ram;
	
	public Laptop(String brand, int ram, int price) {
		// TODO Auto-generated constructor stub
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	private String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	public int compareTo(Laptop lap2) {
		return this.getBrand().compareTo(lap2.getBrand());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + price;
		result = prime * result + ram;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (price != other.price)
			return false;
		if (ram != other.ram)
			return false;
		return true;
	}	
}
