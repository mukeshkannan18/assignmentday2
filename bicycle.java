package week1.day2;


public class bicycle {
	public void canDrive() {
		System.out.println("canDrive");
	}
void brake() {
	System.out.println("brake");
}
private void rideFast() {
	System.out.println("rideFast");
}
public static void main(String[] args) {
	bicycle cycle=new bicycle();
	cycle.canDrive();
	cycle.brake();
	cycle.rideFast();
	}
}
