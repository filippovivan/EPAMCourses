package by.bsu.filippov.traintask.enteties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GoodsWagon extends RailroadCar {
	public static enum GoodsWagonType {
		OPEN, COVERED, FLAT, TANK, SPECIAL, REFRIGIRATED
	}

	private GoodsWagonType type;
	private int capacity;
	private List<String> goods;

	public GoodsWagon() {
		goods = new ArrayList<>();
	}

	public boolean addGoods(String goods) {
		return this.goods.add(goods);
	}

	public Iterator<String> goodsIterator() {
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

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Goods wagon " + " " + type + String.valueOf(getId())
				+ ". Cargo:\n");
		for (String good : goods) {
			builder.append(good + "\n");
		}
		return builder.toString();
	}
}
