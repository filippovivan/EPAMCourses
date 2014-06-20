package by.bsu.traintask.logic;

import java.util.Comparator;

import by.bsu.traintask.enteties.GoodsWagon;

public class GoodsWagonComparators {
	public static Comparator<GoodsWagon> getCapacityComparator() {
		return new Comparator<GoodsWagon>() {

			@Override
			public int compare(GoodsWagon o1, GoodsWagon o2) {
				return o1.getCapacity() - o2.getCapacity();
			}

		};
	}
}
