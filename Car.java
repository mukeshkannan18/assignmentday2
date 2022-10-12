package week1.day2;

public class Car {
public void applyBrake() {
	System.out.println("applyBrake");
}
public void applyGear() {
	System.out.println("applyGear");
}
public void switchOnAC() {
	System.out.println("sswitchOnAC");
}
public void applyAccelarate() {
	System.out.println("applyAccelarate");
}

public static void main(String[] args) {
	Car testing=new Car();
	testing.applyBrake();
	testing.applyGear();
	testing.switchOnAC();
	testing.applyAccelarate();
	
}
}
