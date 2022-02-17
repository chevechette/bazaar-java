package initiald;

public class CarInfo {
	private String	serialNumber;
	private String	brand;
	
	public CarInfo(String serialNumber, String brand) {
		this.setSerialNumber(serialNumber);
		this.setBrand(brand);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CarInfo [serialNumber=");
		builder.append(serialNumber);
		builder.append(", brand=");
		builder.append(brand);
		builder.append("]");
		return builder.toString();
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
