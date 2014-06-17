package by.bsu.traintask.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import by.bsu.traintask.exceptions.TechnicalException;
import by.bsu.traintask.train.Train;

public class TrainParserFromJSON {
	private static final Logger LOG = Logger
			.getLogger(TrainParserFromJSON.class);

	public Train parseTrain(String path) throws TechnicalException {
		StringBuilder builder = new StringBuilder();
		Train train = new Train();
		try {
			try (Scanner scanner = new Scanner(new File(path));) {
				while (scanner.hasNext()) {
					builder.append(scanner.next());
				}
			}
			String fullText = builder.toString();
			JSONParser parser = new JSONParser();
			JSONObject fullObject = (JSONObject) parser.parse(fullText);
		} catch (FileNotFoundException | ParseException e) {
			LOG.error(e);
			throw new TechnicalException(e);
		}
		return train;
	}

}
