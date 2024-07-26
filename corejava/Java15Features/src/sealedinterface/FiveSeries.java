package sealedinterface;

public non-sealed class FiveSeries implements BMWSeries {
	public int start() {
		record PickupData(int pickupTime) {

		}
		return new PickupData(10).pickupTime;
	}
}
