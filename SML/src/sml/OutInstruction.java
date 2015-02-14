package sml;

public class OutInstruction extends Instruction {

	private int register;

	
	public OutInstruction(String label, Scanner sc) {
		super(label,"out");
		this.register = sc.scanInt();
		
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
