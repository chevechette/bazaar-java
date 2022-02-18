package initiald;

public class Car {
	private int		speed;
	private int		maxSpeed = 220;
	
	CarInfo			specs;
	OwnerInfo		owner = null;
	Parking			parking = null;
	
	public Car(CarInfo specs) {
		this(specs, 0);
	}
	
	public Car(CarInfo specs, int speed) {
		this.setSpecs(specs);
		this.setSpeed(speed);
	}
	
	public Car(String serialNumber, String brand, int speed) {
		this.setSpeed(speed);
		this.setSpecs(new CarInfo(serialNumber, brand));
	}
	
	public static void compare(Car one, Car two) {
		StringBuilder	builder;
		
		builder = new StringBuilder();
		builder.append("The car ").append(one.specs.getSerialNumber()).append(" is going ");
		if (one.getSpeed() < two.getSpeed())
			builder.append(two.getSpeed() - one.getSpeed()).append(" km/h less than ");
		else if  (one.getSpeed() > two.getSpeed())
			builder.append(one.getSpeed() - two.getSpeed()).append(" km/h more than ");
		else
			builder.append("at the same speed as ");
		builder.append("the car ").append(two.getSpecs().getSerialNumber()).append(".");
//		"The car WWW is going X km/h less/more than car EEE."
//		"is going at the same speed"
		System.out.println(builder.toString());
	}
	
	public void compare(Car otherCar) {
		compare(this, otherCar);
	}
	
	public void accelerate(int speed) {
		this.setSpeed(this.speed + speed);
	}
	
	public void decelerate(int speed) {
		this.setSpeed(this.speed - speed);
	}

	@Override
	public String toString() {
		StringBuilder	builder = new StringBuilder();
		builder.append("Car [speed=");
		builder.append(speed);
		builder.append(", maxSpeed=");
		builder.append(maxSpeed);
//		builder.append(", specs=");
//		builder.append(specs);
//		builder.append(", owner=");
//		builder.append(owner);
//		builder.append(", parking=");
//		builder.append(parking);
		builder.append("]");
		return builder.toString();
	}

	public int getSpeed() {
		return speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public CarInfo getSpecs() {
		return specs;
	}

	public OwnerInfo getOwner() {
		return owner;
	}

	public Parking getParking() {
		return parking;
	}

	public void setSpeed(int speed) throws ArithmeticException {
		if (this.speed + speed > this.maxSpeed)
			throw new ArithmeticException("The car is going too fast.");
		else if (this.speed + speed < 0)
			throw new ArithmeticException("The car cannot go in reverse.");
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (this.speed + speed < 0)
			throw new ArithmeticException("The car cannot go in reverse.");
		this.maxSpeed = maxSpeed;
	}

	public void setSpecs(CarInfo specs) throws NullPointerException {
		if (specs == null)
			throw new NullPointerException("All cars must have valid specs.");
		this.specs = specs;
	}

	public void setOwner(OwnerInfo owner) {
		if (this.owner.equals(owner))
			return;
		this.owner = owner;
	}

	public void setParking(Parking parking) {
		if (this.parking.equals(parking))
			return;
		this.parking = parking;
	}
}
