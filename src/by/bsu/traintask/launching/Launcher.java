package by.bsu.traintask.launching;

import java.util.Comparator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import by.bsu.traintask.enteties.PassengerCar;
import by.bsu.traintask.logic.PassengerCarComparing;

public class Launcher {
	static {
		new DOMConfigurator().doConfigure("resourses/logconfig.xml",
				LogManager.getLoggerRepository());
	}
	private static final Logger log = Logger.getLogger(Launcher.class);

	public static void main(String[] args) {
		Comparator<PassengerCar> comp = PassengerCarComparing
				.getComfortComparator();
		log.error("sdjkfnvslkdbvjd");
	}

}
