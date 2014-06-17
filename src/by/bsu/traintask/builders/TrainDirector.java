package by.bsu.traintask.builders;

import by.bsu.traintask.enteties.Train;

public class TrainDirector {
	private TrainBuilder builder;

	public void setTrainBuilder(TrainBuilder builder) {
		this.builder = builder;
	}
	public Train buildTrain() {
		return builder.buildTrain();
	}
}
