package by.bsu.traintask.builders;

import by.bsu.traintask.enteties.Train;
import by.bsu.traintask.exceptions.TechnicalException;

public abstract class AbstractTrainBuilder {
	protected Train train;

	public void createNewTrain() {
		train = new Train();
	}

	public abstract Train buildTrain() throws TechnicalException;
}
