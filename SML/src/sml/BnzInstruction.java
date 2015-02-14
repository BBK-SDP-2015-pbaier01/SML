package sml;

public class BnzInstruction extends Instruction {

	private int register;
	private String nextLabel; 

	
	public BnzInstruction(String label, Scanner sc) {
		super(label, "bnz");
		this.register = sc.scanInt();
		this.nextLabel = sc.scan();
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
