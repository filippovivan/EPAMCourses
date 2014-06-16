package by.bsu.filippov.traintask.enteties;

import java.util.Iterator;
import java.util.List;

public class Lokomotive extends TrainPart {
	public static enum LocomotiveType {
		ELECTRIC, DIESEL
	}

	private LocomotiveType type;

	private int EnginePower;
	private List<String> drivers;

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
		return EnginePower;
	}

	public void setEnginePower(int enginePower) {
		EnginePower = enginePower;
	}

}
