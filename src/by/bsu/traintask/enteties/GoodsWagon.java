package by.bsu.traintask.enteties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import by.bsu.traintask.enteties.accessory.Cargo;
import by.bsu.traintask.exceptions.LogicalException;

public class GoodsWagon extends RailroadCar {
	public static enum GoodsWagonType {
		OPEN, COVERED, FLAT, TANK, SPECIAL, REFRIGIRATED
	}

	private GoodsWagonType type;
	private int capacity;
	private List<Cargo> goods;

	public GoodsWagon() {
		goods = new ArrayList<>();
	}

	public boolean addGoods(Cargo goods) {
		return this.goods.add(goods);
	}

	public Iterator<Cargo> goodsIterator() {
		return goods.iterator();
	}

	public GoodsWagonType getType() {
		return type;
	}

	public void setType(GoodsWagonType type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) throws LogicalException {
		if (capacity >= 0) {
			this.capacity = capacity;
		}
		throw new LogicalException("Can't set negative capacity.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Goods wagon " + " " + type + String.valueOf(getId())
				+ ". Cargo:\n");
		for (Cargo good : goods) {
			builder.append(good + "\n");
		}
		return builder.toString();
	}
}