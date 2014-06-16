package by.bsu.filippov.traintask.enteties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lokomotive extends TrainPart {
	public static enum LocomotiveType {
		ELECTRIC, DIESEL
	}

	private LocomotiveType type;
	private int enginePower;
	private List<String> drivers;

	public Lokomotive() {
		drivers = new ArrayList<>();
	}

	public boolean addDriver(String driver) {
		return this.drivers.add(driver);
	}

	public Iterator<String> driversIterator() {
		return drivers.iterator();
	}

	public LocomotiveType getType() {
		return type;
	}

	public void setType(LocomotiveType type) {
		this.type = type;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Locomotive " + " " + type + " " + enginePower + " "
				+ String.valueOf(getId()) + ". Cargo:\n");
		for (String driver : drivers) {
			builder.append(driver + "\n");
		}
		return builder.toString();
	}

}
