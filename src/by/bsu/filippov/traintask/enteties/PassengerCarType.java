package by.bsu.filippov.traintask.enteties;

public enum PassengerCarType {
	COACH {
		@Override
		public int getComfortLevel() {
			return COACH_COMFORT_LEVEL;
		}
	},
	SECONDARY_CLASS {
		@Override
		public int getComfortLevel() {
			return SECONDARY_CLASS_COMFORT_LEVEL;
		}
	},
	SLEEPING {
		@Override
		public int getComfortLevel() {
			return SLEEPING_COMFORT_LEVEL;
		}
	},
	DINING {
		@Override
		public int getComfortLevel() {
			return DINING_COMFORT_LEVEL;
		}
	};
	private static final int DINING_COMFORT_LEVEL = 1;
	private static final int SLEEPING_COMFORT_LEVEL = 4;
	private static final int SECONDARY_CLASS_COMFORT_LEVEL = 3;
	private static final int COACH_COMFORT_LEVEL = 2;

	public abstract int getComfortLevel();
}