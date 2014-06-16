package by.bsu.filippov.traintask.logic;

import java.util.Comparator;

import org.apache.log4j.Logger;

import by.bsu.filippov.traintask.enteties.PassengerCar;
import by.bsu.filippov.traintask.enteties.PassengerCar.PassengerCarClass;

public class PassengerCarComparing {
	private static Logger log = Logger.getLogger(PassengerCarComparing.class);

	public static Comparator<PassengerCar> getComfortComparator() {
		log.debug("Comfort comparator created");
		return new Comparator<PassengerCar>() {

			@Override
			public int compare(PassengerCar o1, PassengerCar o2) {
				if (o1.getType().equals(PassengerCarClass.SLEEPING)) {
					// TODO: Сделать сравнение.
				}
				return 0;
			}

		};
	}
}
