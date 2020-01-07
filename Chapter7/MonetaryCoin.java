public class MonetaryCoin extends Coin {
	private int value;

	public MonetaryCoin(int value) {
		this.value = value;
	}

	public MonetaryCoin() {
		this.value = 0;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
