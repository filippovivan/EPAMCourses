package by.bsu.traintask.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import by.bsu.traintask.enteties.GoodsWagon;
import by.bsu.traintask.enteties.RailroadCar;
import by.bsu.traintask.enteties.accessory.PassengerCarType;
import by.bsu.traintask.exceptions.LogicalException;
import by.bsu.traintask.exceptions.TechnicalException;
import by.bsu.traintask.train.Train;

public class TrainParserFromJSON {
	private static final Logger LOG = Logger
			.getLogger(TrainParserFromJSON.class);

	public Train parseTrain(String path) throws TechnicalException {
		StringBuilder builder = new StringBuilder();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(path));
			while (scanner.hasNext()) {
				builder.append(scanner.next());
			}

			String fullText = builder.toString();
			JSONParser parser = new JSONParser();
			JSONObject fullObject = (JSONObject) parser.parse(fullText);
			JSONObject trainPart;
			List<RailroadCar> cars = new ArrayList<>();
			int i = 0;
			while ((trainPart = (JSONObject) fullObject.get("car" + i)) != null) {
				try {
					cars.add(parceCar(trainPart));
				} catch (LogicalException e) {
					LOG.error("Invalid car fields values.", e);
				}
			}
		} catch (FileNotFoundException e) {
			LOG.error(e);
			throw new TechnicalException(e);
		} catch (ParseException e) {
			LOG.error(e);
			throw new TechnicalException("Invalid JSON file.", e);
		} finally {
			scanner.close();
		}
		return null;
	}

	private RailroadCar parceCar(JSONObject trainPart)
			throws TechnicalException, LogicalException {
		String type = (String) trainPart.get("cartype");
		switch (type) {
		case "passenger":
			return parcePassengerCar(trainPart);
		case "goods":
			return parceGoodsWagon(trainPart);
		default:
			throw new TechnicalException("Invalid JSON file");
		}
	}

	private void parceRailroadCarInfo(RailroadCar wagon, JSONObject carString)
			throws LogicalException {
		wagon.setId(Integer.valueOf((String) carString.get("id")));
		wagon.setMass(Integer.valueOf((String) carString.get("mass")));
		wagon.setAxelNumber(Integer.valueOf((String) carString.get("axis")));
	}

	private GoodsWagon parceGoodsWagon(JSONObject wagonString)
			throws LogicalException {
		GoodsWagon wagon = new GoodsWagon();
		parceRailroadCarInfo(wagon, wagonString);
		wagon.setType(GoodsWagon.GoodsWagonType.valueOf((String) wagonString
				.get("goodswagontype")));
		wagon.setCapacity(Integer.valueOf((String) wagonString.get("capacity")));
		return wagon;
	}

	private RailroadCar parcePassengerCar(JSONObject trainPart) {
		// TODO Auto-generated method stub
		return null;
	}

}
