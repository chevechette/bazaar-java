package ajc.basics;

public class House {
	private String	color;
	private String	adress;
	private double	surface;
	
	public House(String color, String adress, double surface) {
		this.setColor(color);
		this.setAdress(adress);
		this.setSurface(surface);
	}
	
	public void		displayInfos() {
		System.out.println(this.toString());
	}

	@Override
	public String	toString() {
		return "House [color=" + color + ", adress=" + adress + ", surface=" + surface + "]";
	}

	public String	getColor() {
		return color;
	}

	public String	getAdress() {
		return adress;
	}

	public double	getSurface() {
		return surface;
	}

	public void		setColor(String color) {
		this.color = (color == null) ? "red" : adress;
	}

	public void 	setAdress(String adress) {
		this.adress = (adress == null) ? "221B Baker Street, London" : adress;
	}

	public void		setSurface(double surface) {
		this.surface = (surface < 0) ? 42.42 : surface;
	}
}
