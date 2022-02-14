package ajc.basics;

public class Computer {
	static private int	maxMemory = 128;
	private String		model;
	private int			memory;
	
	public Computer(String model, int memory) {
		this.setModel(model);
		this.setMemory(memory);
	}
	
	static public void	addMemory(int amount) {
		Computer.maxMemory += amount;	
	}
	
	static public void	removeMemory(int amount) {
		Computer.maxMemory -= amount;
	}

	@Override
	public String toString() {
		return "Computer [model=" + model + ", memory=" + memory + "]";
	}

	public static int getMaxMemory() {
		return maxMemory;
	}

	public static void setMaxMemory(int maxMemory) {
		Computer.maxMemory = maxMemory;
	}

	public String getModel() {
		return model;
	}

	public int getMemory() {
		return memory;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMemory(int memory) {
		this.memory = (memory < Computer.maxMemory) ?
				memory : Computer.maxMemory;
	}
	
	
}
