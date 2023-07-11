package entities;

public class Person {
	
	private double height;
	private String gender;
	
	public Person(double height, String gender) {
		this.height = height;
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
