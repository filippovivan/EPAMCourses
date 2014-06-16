package by.bsu.filippov.train.enteties;

public class GoodsWagon extends RailroadCar {
	public enum GoodsWagonType {
		OPEN, COVERED, REFRIGIRATED, FLAT, SPECIAL, TANK
	}

	private GoodsWagonType type;
	private int capacity;

	public GoodsWagonType getType() {
		return type;
	}

	public void setType(GoodsWagonType type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
