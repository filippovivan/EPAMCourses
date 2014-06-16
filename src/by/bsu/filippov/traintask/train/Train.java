package by.bsu.filippov.traintask.train;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import by.bsu.filippov.traintask.enteties.Lokomotive;
import by.bsu.filippov.traintask.enteties.RailroadCar;

public class Train {
	private Lokomotive locomotive;
	private List<RailroadCar> cars;

	public Train() {
		cars = new ArrayList<>();
	}

	public Train(Lokomotive locomotive, List<? extends RailroadCar> cars) {
		super();
		this.locomotive = locomotive;
		this.cars = new ArrayList<>();
		this.cars.addAll(cars);
	}

	public Lokomotive getLocomotive() {
		return locomotive;
	}

	public void setLocomotive(Lokomotive locomotive) {
		this.locomotive = locomotive;
	}

	public boolean addCars(List<? extends RailroadCar> cars) {
		return this.cars.addAll(cars);
	}

	public boolean addCar(RailroadCar car) {
		return this.cars.add(car);
	}

	public Iterator<RailroadCar> carsIterator() {
		return cars.iterator();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(locomotive + "\n");
		for (RailroadCar car : cars) {
			builder.append(car + "\n");
		}
		return builder.toString();
	}
}
