package by.bsu.filippov.traintask.enteties;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

public class PassengerCar extends RailroadCar {

	private static final String FULL_CAR_EXCEPTION_TEXT = "Can't add passenger to full car.";
	private static final Logger log = Logger.getLogger(RailroadCar.class);

	public static enum PassengerCarClass {
		COACH, SECONDARY_CLASS, SLEEPING, DINING
	}

	private PassengerCarClass type;
	private int seatingCapacity;
	private List<String> passengers;

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

	public PassengerCarClass getType() {
		return type;
	}

	public void setType(PassengerCarClass type) {
		this.type = type;
	}
}
