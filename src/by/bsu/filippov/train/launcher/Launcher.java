package by.bsu.filippov.train.launcher;

import java.util.Comparator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import by.bsu.filippov.train.enteties.PassengerCar;
import by.bsu.filippov.train.logic.PassengerCarComparing;

public class Launcher {
	private static final Logger log = Logger.getLogger(Launcher.class);
	static {
		new DOMConfigurator().doConfigure("resourses/logconfig.xml",
				LogManager.getLoggerRepository());
	}

	public static void main(String[] args) {
		Comparator<PassengerCar> comp = PassengerCarComparing
				.getComfortComparator();
		log.error("sdjkfnvslkdbvjd");
	}

}
