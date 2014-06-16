package by.bsu.filippov.traintask.enteties;

public abstract class RailroadCar extends TrainPart {
	private int axelNumber;

	public int getAxelPairsNumber() {
		return axelNumber;
	}

	public void setAxelNumber(int axelPairsNumber) {
		this.axelNumber = axelPairsNumber;
	}
}
