package thomas.projects.cars;

public class Car {
	
	private int speed = 0;
	private int maxSpeed = 220;
	private CarInfo carInfo;
	private OwnerInfo ownerInfo;
	
	public Car(CarInfo carInfo) {
		this.carInfo = carInfo;
	}
	
	public Car(int speed, CarInfo carInfo) throws Exception {
		this(carInfo);
		this.accelerate(speed);
	}

	public Car(String serialNumber, String brand, int speed) throws Exception {
		this(speed, new CarInfo(serialNumber, brand));
	}
	
	public void accelerate(int speed) throws Exception {
		if(this.speed+speed > this.maxSpeed) {
			throw new Exception("Speed is to high");
		}
		this.speed += speed;
	}
	
	public void decelerate(int speed) throws Exception {
		if(this.speed+speed < 0) {
			throw new Exception("Speed is below 0");
		}
		this.speed -= speed;
	}
	
	public String compare(Car c) {
		if(this.speed > c.speed) {
			return "The car with SN:"+c.carInfo.getSerialNumber() + "is going slower than " + this.carInfo.getSerialNumber()  ;
		}else if(this.speed < c.speed) {
			return "The car with SN:"+c.carInfo.getSerialNumber() + "is going faster than " + this.carInfo.getSerialNumber()  ;
		}else {
			return "The car with SN:"+c.carInfo.getSerialNumber() + "is going as the same speed of" + this.carInfo.getSerialNumber()  ;
		}
	}
	
	public static String compare(Car c1, Car c2) {
		return c1.compare(c2);
	}
	
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public CarInfo getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(CarInfo carInfo) {
		this.carInfo = carInfo;
	}

	public OwnerInfo getOwnerInfo() {
		return ownerInfo;
	}

	public void setOwnerInfo(OwnerInfo ownerInfo) {
		this.ownerInfo = ownerInfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [speed=");
		builder.append(speed);
		builder.append(", maxSpeed=");
		builder.append(maxSpeed);
		builder.append(", carInfo=");
		builder.append(carInfo);
		builder.append(", ownerInfo=");
		builder.append(ownerInfo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
