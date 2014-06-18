package by.bsu.traintask.launching;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

<<<<<<< HEAD
import by.bsu.traintask.enteties.Train;
import by.bsu.traintask.exceptions.TechnicalException;
import by.bsu.traintask.serialization.TrainParserFromJSON;
=======
import by.bsu.traintask.builders.TrainBuilderFromJSON;
import by.bsu.traintask.enteties.Train;
import by.bsu.traintask.exceptions.TechnicalException;
>>>>>>> f414d3d3cfb6576ca0d29f617ceec4374a4663c2

public class Launcher {
	private static final String TRAIN_JSON_PATH = "resourses/jsontrain.json";

	static {
		new DOMConfigurator().doConfigure("resourses/logconfig.xml",
				LogManager.getLoggerRepository());
	}
<<<<<<< HEAD
	
	private static final Logger LOG = Logger.getLogger(Launcher.class);

	public static void main(String[] args) {
		TrainParserFromJSON parcer = new TrainParserFromJSON();
		try {
			LOG.debug("Parsing began");
			Train train = parcer.parseTrain(TRAIN_JSON_PATH);
=======

	private static final Logger LOG = Logger.getLogger(Launcher.class);

	public static void main(String[] args) {
		TrainBuilderFromJSON parcer = new TrainBuilderFromJSON(TRAIN_JSON_PATH);
		try {
			LOG.debug("Parsing began");
			Train train = parcer.buildTrain();
>>>>>>> f414d3d3cfb6576ca0d29f617ceec4374a4663c2
			LOG.info(train);
		} catch (TechnicalException e) {
			LOG.error(e);
		}
	}
}
