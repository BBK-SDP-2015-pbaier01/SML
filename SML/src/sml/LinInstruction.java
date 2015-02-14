package sml;

/**
 * This class ....
 * 
 * @author someone
 */

public class LinInstruction extends Instruction {
	private int register;
	private int value;

	public LinInstruction(String label, Scanner sc) {
		super(label, "lin");
		this.register = sc.scanInt();
		this.value = sc.scanInt();

	}

	@Override
	public void execute(Machine m) {
		m.getRegisters().setRegister(register, value);
	}

	@Override
	public String toString() {
		return super.toString() + " register " + register + " value is " + value;
	}
}
