package br.uefs.ecomp.upa.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTest {

	Queue queue;
	Link data1, data2, data3, data4, data5, data6, data7;
	
	@BeforeEach
	void test() {
		queue = new Queue();
		data1 = new Link(1, 1);
		data2 = new Link(3, 0);
		data3 = new Link(50, 3);
		data4 = new Link(23, 2);
		data5 = new Link(0, 0);
		data6 = new Link(5, 1);
		data7 = new Link(7, 4);
	}
	
	@Test
	void insertDeletTest() {
		boolean o;
		o = queue.insert(data1);
		assertTrue(o);
		o = queue.insert(data2);
		assertTrue(o);
		o = queue.insert(data3);
		assertTrue(o);
		o = queue.insert(data4);
		assertTrue(o);
		o = queue.insert(data5);
		assertTrue(o);
		o = queue.insert(data6);
		assertTrue(o);
		o = queue.insert(data7);
		assertTrue(o);
	
		
		assertEquals(data2, queue.delete());
		assertEquals(data5, queue.delete());
		assertEquals(data1, queue.delete());
		assertEquals(data6, queue.delete());
		assertEquals(data4, queue.delete());
		assertEquals(data3, queue.delete());
		assertEquals(data7, queue.delete());
	
	}

}
