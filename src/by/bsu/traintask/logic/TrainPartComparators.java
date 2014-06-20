package by.bsu.traintask.logic;

import java.util.Comparator;

import by.bsu.traintask.enteties.TrainPart;

public class TrainPartComparators {
	public static Comparator<TrainPart> getMassComparator() {
		return new Comparator<TrainPart>() {

			@Override
			public int compare(TrainPart train0, TrainPart train1) {
				return train0.getMass() - train1.getMass();
			}

		};
	}
}
