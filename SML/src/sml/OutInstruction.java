package sml;

public class OutInstruction extends Instruction {

	private int register;

	public OutInstruction(String l, String op) {
		super(l, op);
		// TODO Auto-generated constructor stub
	}
	
	public OutInstruction(String label, int register) {
		super(label,"out");
		this.register = register;
		
	}

	@Override
	public void execute(Machine m) {
//		System.out.println(m.getRegisters().getRegister(register));
		toString();
	}
	
	@Override
	public String toString() {
		return super.toString() + " register " + register ;
	}


}
