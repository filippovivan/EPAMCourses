package by.bsu.traintask.logic;

import java.util.Comparator;

import org.apache.log4j.Logger;

import by.bsu.traintask.enteties.PassengerCar;

public class PassengerCarComparing {
	private static Logger LOG = Logger.getLogger(PassengerCarComparing.class);

	public static Comparator<PassengerCar> getComfortComparator() {
		LOG.debug("Comfort comparator created");
		return new Comparator<PassengerCar>() {

			@Override
			public int compare(PassengerCar o1, PassengerCar o2) {
				return o1.getType().comfortLevel - o2.getType().comfortLevel;
			}

		};
	}

	public static Comparator<PassengerCar> getCapacityComparator() {
		LOG.debug("Capacity comparator created");
		return new Comparator<PassengerCar>() {

			@Override
			public int compare(PassengerCar o1, PassengerCar o2) {
				return o1.getSeatingCapacity() - o2.getSeatingCapacity();
			}

		};
	}
}
