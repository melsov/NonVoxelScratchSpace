import static org.junit.Assert.*;

import org.junit.Test;


public class TestRingBufferishThing {

	@Test
	public void test() {
		RingBufferishThing<Integer> rbt = new RingBufferishThing<>(Integer.class, 10);
		int extra = 40;
		for(int i = 0; i < rbt.elements.length + extra ; ++i) {
			rbt.add(i);
		}
		
		for(int i = 0; i < rbt.currentLength(); ++i) {
			System.out.print(" " + rbt.get(i));
		}
		
		assertTrue("first element is 2 now", rbt.get(0) == extra);
		
		
	}

}
