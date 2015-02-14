package sml;

public class MulInstruction extends Instruction {

	public MulInstruction(String label, Scanner sc) {
		super(label, "mul", sc);
	
	}

	@Override
	public void execute(Machine m) {
		int value1 = m.getRegisters().getRegister(op1);
		int value2 = m.getRegisters().getRegister(op2);
		m.getRegisters().setRegister(result, value1 * value2);
	}

	@Override
	public String toString() {
		return super.toString() + " " + op1 + " - " + op2 + " to " + result;
	}


}
