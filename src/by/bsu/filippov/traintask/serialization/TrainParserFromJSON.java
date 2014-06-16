package by.bsu.filippov.traintask.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import by.bsu.filippov.traintask.train.Train;

public class TrainParserFromJSON {
	private static final Logger log = Logger
			.getLogger(TrainParserFromJSON.class);

	public Train parseTrain(String path) {
		StringBuilder builder = new StringBuilder();
		Scanner scanner;
		Train train = new Train();
		try {
			scanner = new Scanner(new File(path));
			while (scanner.hasNext()) {
				builder.append(scanner.next());
			}
			String fullText = builder.toString();
			JSONParser parser = new JSONParser();
			JSONObject fullObject = (JSONObject) parser.parse(fullText);
		} catch (FileNotFoundException e) {
			log.error(e);
		} catch (ParseException e) {
			log.error(e);
		}
		return train;
	}

}
