import java.lang.Math.*;

public class Car {
	
	//instance variables
	private String paint, interior, engine, tires;
	
	public Car(String p, String i, String e, String t) {
		//constructor
		paint = p;
		interior = i;
		engine = e;
		tires = t;

	}
	
	public void setCustom(String p, String i, String e, String t) {
		paint = p;
		interior = i;
		engine = e;
		tires = t;

	}
	
	public String getPaint() {
		return paint;
	}
	public String getInterior() {
		return interior;
	}
	public String getEngine() {
		return engine;
	}
	public String getTires() {
		return tires;
	}
}