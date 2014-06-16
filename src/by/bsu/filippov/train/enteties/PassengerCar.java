package by.bsu.filippov.train.enteties;

public class PassengerCar extends RailroadCar {
	public enum PassengerCarClass {
		COACH, SECONDARY_CLASS, SLEEPING, DINING
	}

	private PassengerCarClass type;
	private int seatingCapacity;

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public PassengerCarClass getType() {
		return type;
	}

	public void setType(PassengerCarClass type) {
		this.type = type;
	}
}
