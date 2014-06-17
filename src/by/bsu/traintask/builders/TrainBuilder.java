package by.bsu.traintask.builders;

import by.bsu.traintask.enteties.Train;

public abstract class TrainBuilder {
	protected Train train;

	public Train getTrain() {
		return train;
	}

	public abstract Train buildTrain();

}
