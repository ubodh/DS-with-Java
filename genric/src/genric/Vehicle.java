package genric;

public class Vehicle implements printInterface {
	int maxspeed;
	String color;
	public  Vehicle(int maxspeed,String color) {
		super();
		this.maxspeed=maxspeed;
		this.color=color;
	}
	public void print() {
		System.out.println(maxspeed+" "+color);
	}

}
