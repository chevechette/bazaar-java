package thomas.genericity;

import lombok.Data;

@Data class Computer {

	private String name;
	private int memory;
	private float cpu;
	
	public Computer addName(String name) {
		this.name = name;
		return this;
	}
	
	public Computer addMemory(int memory) {
		this.memory = memory;
		return this;
	}
	
	public Computer addCpu(float cpu) {
		this.cpu = cpu;
		return this;
	}
	
	public static Computer build() {
		return new Computer();
	}
	
}
