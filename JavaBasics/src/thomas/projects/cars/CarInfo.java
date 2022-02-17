package thomas.projects.cars;

public class CarInfo {
	
	private String serialNumber;
	private String brand;
	
	public CarInfo(String serialNumber, String brand) {
		super();
		this.serialNumber = serialNumber;
		this.brand = brand;
	}

	
	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
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
	
	

}
