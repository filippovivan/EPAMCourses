package by.bsu.filippov.train.enteties;

public class Lokomotive extends TrainPart {
	public enum LocomotiveType {
		ELECTRIC, DIESEL
	}

	private LocomotiveType type;

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

	private int EnginePower;

}
