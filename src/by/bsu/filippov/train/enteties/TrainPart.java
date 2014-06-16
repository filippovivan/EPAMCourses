package by.bsu.filippov.train.enteties;

public abstract class TrainPart {
	private int id;
	private int taroMass;
	private int height;

	public int getMass() {
		return taroMass;
	}

	public void setMass(int mass) {
		this.taroMass = mass;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
