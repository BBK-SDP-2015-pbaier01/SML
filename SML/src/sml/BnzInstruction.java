package sml;

public class BnzInstruction extends Instruction {

	private int register;
	private String nextLabel; 

	public BnzInstruction(String l, String op) {
		super(l, op);
	}
	
	public BnzInstruction(String label, int register, String nextLabel) {
		super(label, "bnz");
		this.register = register;
		this.nextLabel = nextLabel;
	}

	@Override
	public void execute(Machine m) {
		if (m.getRegisters().getRegister(register) != 0) {
			m.setPc(m.getLabels().indexOf(nextLabel));
		}
	}

	@Override
	public String toString() {
		return super.toString() + " register "+ register + ", nextLabel is "
				+ nextLabel ;
	}


}
