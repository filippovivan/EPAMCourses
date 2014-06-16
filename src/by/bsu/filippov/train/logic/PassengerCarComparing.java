package by.bsu.filippov.train.logic;

import java.util.Comparator;

import org.apache.log4j.Logger;

import by.bsu.filippov.train.enteties.PassengerCar;
import by.bsu.filippov.train.enteties.PassengerCar.PassengerCarClass;

public class PassengerCarComparing {
	private static Logger log = Logger.getLogger(PassengerCarComparing.class
			.getName());

	public static Comparator<PassengerCar> getComfortComparator() {
		log.debug("Comfort comparator created");
		return new Comparator<PassengerCar>() {

			@Override
			public int compare(PassengerCar o1, PassengerCar o2) {
				if (o1.getType().equals(PassengerCarClass.SLEEPING)) {
					// TODO: ������� ���������.
				}
				return 0;
			}

		};
	}
}
