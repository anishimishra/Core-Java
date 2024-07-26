package objectmethods;

public class ElectricityBill {
	private double meterNo;
	private String name;
	private String address;

	public double getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(double meterNo) {
		this.meterNo = meterNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "meter no " + this.getMeterNo() + " name " + this.getName() + " address " + this.getAddress();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		ElectricityBill bill = (ElectricityBill) obj;
		if (bill.getMeterNo() == this.getMeterNo()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (int) this.getMeterNo();
	}
}
