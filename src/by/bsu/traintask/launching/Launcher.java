package by.bsu.traintask.launching;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import by.bsu.traintask.enteties.Train;
import by.bsu.traintask.exceptions.TechnicalException;
import by.bsu.traintask.serialization.TrainParserFromJSON;

public class Launcher {
	private static final String TRAIN_JSON_PATH = "resourses/jsontrain.json";

	static {
		new DOMConfigurator().doConfigure("resourses/logconfig.xml",
				LogManager.getLoggerRepository());
	}
	
	private static final Logger LOG = Logger.getLogger(Launcher.class);

	public static void main(String[] args) {
		TrainParserFromJSON parcer = new TrainParserFromJSON();
		try {
			LOG.debug("Parsing began");
			Train train = parcer.parseTrain(TRAIN_JSON_PATH);
			LOG.info(train);
		} catch (TechnicalException e) {
			LOG.error(e);
		}
	}
}
