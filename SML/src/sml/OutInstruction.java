package sml;

public class OutInstruction extends Instruction {

	private int register;
	private int contentOfRegister;

	
	public OutInstruction(String label, Scanner sc) {
		super(label,"out");
		this.register = sc.scanInt();
		
	}

	public int getContentOfRegister() {
		return contentOfRegister;
	}


	@Override
	public void execute(Machine m) {
		contentOfRegister = m.getRegisters().getRegister(register);
		System.out.println("register " + register + " = " + m.getRegisters().getRegister(register));
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " register " + register ;
	}


}
