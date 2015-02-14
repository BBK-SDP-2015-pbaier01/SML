package sml;

/**
 * @author Peter
 *	
 *	Scanner interface helps Translator class reflection to tell
 *	getConstructor which parameters to get for the current Instruction subclass
 */
public interface Scanner {
	
	public String scan();
	
	public int scanInt();
}
