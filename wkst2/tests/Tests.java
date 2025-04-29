package tests;

import question1.Worksheet3;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;


public class Tests {
	/*
	 * These are just some tests I used. I got too lazy to write the rest of them sorry guys
	 * Practicing writing your own tests is good though! (it's okay I hate it too)
	 */
	@Test public void testRemoveEdge() {
		//edge case with 0s at end
		ArrayList<Integer> s = new ArrayList<>(Arrays.asList(0, 0, 0, 4, 2, 0));
		
		Worksheet3.removeAll(s, 4);
 		assertEquals(s, Arrays.asList(0, 0, 0, 2, 0, 0));
 		Worksheet3.removeAll(s, 2);
 		assertEquals(s, Arrays.asList(0, 0, 0, 0, 0, 0));
    }
	@Test public void testRemove() {
		ArrayList<Integer> s = new ArrayList<>(Arrays.asList(1, 3, 0, 3, 4));
		Worksheet3.removeAll(s, 3);
		assertEquals(s, Arrays.asList(1, 0, 4, 0, 0));
		Worksheet3.removeAll(s, 1);
		assertEquals(s, Arrays.asList(0, 4, 0, 0, 0));
	}
}