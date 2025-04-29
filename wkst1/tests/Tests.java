package tests;



import codeExamples.Worksheet1;
import org.junit.*;
import static org.junit.Assert.*;

public class Tests {
	 	@Test public void testFindPos() {
	 		int arr[] = {1, 2, 3, 2, 1};
	 		assertEquals(Worksheet1.findPos(arr, 1), 4);
	 		assertEquals(Worksheet1.findPos(arr, 3), 2);
	    }
	 	@Test public void jcdk() {
	 	   int arr1[] = {1, 2, 3, 2, 1};
	 	   int result[] = {6, 1, 2, 3, 2};
	 	   Worksheet1.insertAtFront(arr1, 6);
	 	   assertArrayEquals(arr1, result);
	 	}
 
	    @Test public void testRemove() {
	    	int arr[] = {1, 2, 3, 2, 1};
	    	int exp1[] = {1, 3, 2, 1, 0};
	    	int exp2[] = {1, 2, 1, 0, 0};
	    	Worksheet1.remove(arr, 2);
	    	assertArrayEquals(arr, exp1);
	    	Worksheet1.remove(arr, 3);
	 		assertArrayEquals(arr, exp2);
	        
	    }
	    @Test public void testAddFront() {
	    	int arr[] = {1, 2, 3, 2, 1};
	    	int exp[] = {8, 1, 2, 3, 2};
	    	Worksheet1.insertAtFront(arr, 8); //8
	    	assertArrayEquals(arr, exp);
	    	
	    }
}
