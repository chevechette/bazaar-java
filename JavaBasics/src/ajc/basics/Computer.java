package ajc.basics;

public class Computer {
	static private int	maxMemory = 128;
	private String		model;
	private int			memory;
	private int			processorFreq;
	
	public Computer(String model, int memory) {
		this(model, memory, 3);
	}
	
	public Computer(String model, int memory, int processorFreq) {		
		this.setModel(model);
		this.setMemory(memory);
		this.setProcessorFreq(processorFreq);
	}
	
	static public void	addMemory(int amount) {
		Computer.maxMemory += amount;	
	}
	
	static public void	removeMemory(int amount) {
		Computer.maxMemory -= amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computer [model=");
		builder.append(model);
		builder.append(", memory=");
		builder.append(memory);
		builder.append(", processorFreq=");
		builder.append(processorFreq);
		builder.append("]");
		return builder.toString();
	}

	public int getProcessorFreq() {
		return processorFreq;
	}

	public void setProcessorFreq(int processorFreq) {
		this.processorFreq = processorFreq;
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
