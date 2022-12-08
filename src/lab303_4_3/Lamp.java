package lab303_4_3;

public class Lamp {
	private int light;
	private boolean isOn;
	
	public void turnOn() {
		this.isOn = true;
		System.out.println("Light On? " + isOn);
	}
	
	public void turnOff() {
		this.isOn = false;
		System.out.println("Light On? " + isOn);
	}
	
	public static void main(String[] args) {
		Lamp halogen = new Lamp();
		halogen.turnOff();
		halogen.turnOn();
	}
}
