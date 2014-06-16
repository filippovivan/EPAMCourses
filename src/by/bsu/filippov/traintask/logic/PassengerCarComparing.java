package by.bsu.filippov.traintask.logic;

import java.util.Comparator;

import org.apache.log4j.Logger;

import by.bsu.filippov.traintask.enteties.PassengerCar;

public class PassengerCarComparing {
	private static Logger log = Logger.getLogger(PassengerCarComparing.class);

	public static Comparator<PassengerCar> getComfortComparator() {
		log.debug("Comfort comparator created");
		return new Comparator<PassengerCar>() {

			@Override
			public int compare(PassengerCar o1, PassengerCar o2) {
				return o1.getType().getComfortLevel()
						- o2.getType().getComfortLevel();
			}

		};
	}

	public static Comparator<PassengerCar> getCapacityComparator() {
		log.debug("Capacity comparator created");
		return new Comparator<PassengerCar>() {

			@Override
			public int compare(PassengerCar o1, PassengerCar o2) {
				return o1.getSeatingCapacity() - o2.getSeatingCapacity();
			}

		};
	}
}
