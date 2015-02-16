
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import sml.*;


/**
 * @author Peter
 *
 */
public class AddInstructionTest {
	
	private Machine m;
	private AddInstruction add;
	private MulInstruction mul;
	private DivInstruction div;
	private SubInstruction sub;
	private LinInstruction lin;
	private OutInstruction out;
	private BnzInstruction bnz;
	private Scanner sc;
	private int result = 4;
	private  int op1 = 2;
	private  int op2 = 3;
	private int num1 = 12;
	private int num2 = 6;

	
	
	
	@Before
	public void setUp() throws Exception {
		m = new Machine();
		sc = mock(Scanner.class);
		m.execute();
	}

	
	@After
	public void tearDown() throws Exception {
		m = null;
		
	}

	@Test
	public void AddTest() {
		
		
		when(sc.scanInt()).thenReturn( result , op1 , op2 );
		add = new AddInstruction("t1", sc);
		m.getProg().add(add);
        m.getRegisters().setRegister(op1, num1);
        m.getRegisters().setRegister(op2, num2);
        add.execute(m);
        assertNotNull(add);
        assertEquals(12, m.getRegisters().getRegister(op1)); 
        assertEquals(6, m.getRegisters().getRegister(op2));
        assertEquals(18, m.getRegisters().getRegister(result));
        
	}
	
	@Test
	public void MulTest() {
		
		when(sc.scanInt()).thenReturn( result , op1 , op2 );
		mul = new MulInstruction("t2", sc);
		m.getProg().add(add);
        m.getRegisters().setRegister(op1, num1);
        m.getRegisters().setRegister(op2, num2);
        mul.execute(m);
        assertNotNull(mul);
        assertEquals(12, m.getRegisters().getRegister(op1)); 
        assertEquals(6, m.getRegisters().getRegister(op2));
        assertEquals(72, m.getRegisters().getRegister(result));
	}
	
	@Test
	public void DivTest() {
		
		when(sc.scanInt()).thenReturn( result , op1 , op2 );
		div = new DivInstruction("t3", sc);
		m.getProg().add(div);
        m.getRegisters().setRegister(op1, num1);
        m.getRegisters().setRegister(op2, num2);
        div.execute(m);
        assertNotNull(div);
        assertEquals(12, m.getRegisters().getRegister(op1)); 
        assertEquals(6, m.getRegisters().getRegister(op2));
        assertEquals(2, m.getRegisters().getRegister(result));
	}
	
	@Test
	public void SubTest() {
		
		when(sc.scanInt()).thenReturn( result , op1 , op2 );
		sub = new SubInstruction("t4", sc);
		m.getProg().add(sub);
        m.getRegisters().setRegister(op1, num1);
        m.getRegisters().setRegister(op2, num2);
        sub.execute(m);
        assertNotNull(sub);
        assertEquals(12, m.getRegisters().getRegister(op1)); 
        assertEquals(6, m.getRegisters().getRegister(op2));
        assertEquals(6, m.getRegisters().getRegister(result));
	}
	
	@Test
	public void LinTest() {
		
		when(sc.scanInt()).thenReturn( op1 , num1 );
		lin = new LinInstruction("t5", sc);
		m.getProg().add(lin);
        lin.execute(m);
        assertNotNull(lin);
        assertEquals(12, m.getRegisters().getRegister(op1)); 
	}
	
	@Test
	public void OutTest() {
		
		when(sc.scanInt()).thenReturn( op1 );
		out = new OutInstruction("t6", sc);
		m.getProg().add(out);
        m.getRegisters().setRegister(op1, num1);
   
        out.execute(m);
        assertNotNull(out);
        assertEquals(12,out.getContentOfRegister());
	}
	
	@Test
	public void BnzTest() {
		String nextLabel = "t8";
		
		when(sc.scanInt()).thenReturn( op1 );
		when(sc.scan()).thenReturn(nextLabel);
		bnz = new BnzInstruction("t7", sc);
		m.getProg().add(bnz);
        m.getRegisters().setRegister(op1, num1);
   
        bnz.execute(m);
        assertNotNull(bnz);
        assertEquals("t8",bnz.getNextLabel());
	}
	
	
	
	

}
