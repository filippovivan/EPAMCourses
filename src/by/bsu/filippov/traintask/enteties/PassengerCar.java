package by.bsu.filippov.traintask.enteties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

public class PassengerCar extends RailroadCar {

	private static final String FULL_CAR_EXCEPTION_TEXT = "Can't add passenger to full car.";
	private static final Logger log = Logger.getLogger(RailroadCar.class);

	private PassengerCarType type;
	private int seatingCapacity;
	private List<String> passengers;

	public PassengerCar() {
		passengers = new ArrayList<>();
	}

	public boolean addPassenger(String passengers) {
		if (this.passengers.size() < seatingCapacity) {
			return this.passengers.add(passengers);
		} else {
			RuntimeException e = new IllegalStateException(
					FULL_CAR_EXCEPTION_TEXT);
			log.error(e);
			throw e;
		}
	}

	public Iterator<String> passengersIterator() {
		return passengers.iterator();
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public PassengerCarType getType() {
		return type;
	}

	public void setType(PassengerCarType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Passengers car " + " " + type + String.valueOf(getId())
				+ ". Passengers:\n");
		for (String passenger : passengers) {
			builder.append(passenger + "\n");
		}
		return builder.toString();
	}
}
