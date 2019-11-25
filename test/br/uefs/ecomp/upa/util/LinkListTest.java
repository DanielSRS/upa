package br.uefs.ecomp.upa.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkListTest {

	LinkList list;
	Object data1, data2, data3, data4, data5;
	
	@BeforeEach
	public void setup() {
		list = new LinkList(); 
	}
	
	@Test
	public void instaceTest() {
		assertFalse(list == null);
	}
	
	@BeforeEach
	public void creatLinks() {
		data1 = new Link(2, 0);
		data2 = new Link(3, 3);
		data3 = new Link(4, 4);
		data4 = new Link(1, 1);
		data5 = new Link(0, 0);
	}
	
	@Test
	public void insertFirstTest() {
		list.insertFirst((Link) data1);
		list.insertFirst((Link) data2);
		list.insertFirst((Link) data3);
		list.insertFirst((Link) data4);
		
		Link x = list.getFirst();
		
		assertEquals(data1, list.getLast());
		
		assertEquals(data4, x);
		x = x.next;
		assertEquals(data3, x);
		x = x.next;
		assertEquals(data2, x);
		x = x.next;
		assertEquals(data1, x);
		x = x.next;
		assertNull(x);
	}
	
	@Test
	public void insertLastTest() {
		list.insertFirst((Link) data1);
		list.insertFirst((Link) data2);
		list.insertFirst((Link) data3);
		list.insertFirst((Link) data4);
		list.insertLast((Link) data5);
		
		Link x = list.getFirst();
		
		assertEquals(data5, list.getLast());
		
		assertEquals(data4, x);
		x = x.next;
		assertEquals(data3, x);
		x = x.next;
		assertEquals(data2, x);
		x = x.next;
		assertEquals(data1, x);
		x = x.next;
		assertEquals(data5, x);
		x = x.next;
		assertNull(x);
	}
	
	@BeforeEach
	public void insertForDelet() {
		list.insertFirst((Link) data1);
		list.insertFirst((Link) data2);
		list.insertFirst((Link) data3);
		list.insertFirst((Link) data4);
		list.insertLast((Link) data5);
		
	}
	
	@Test
	public void deletFirstTest() {
		assertEquals(5, list.size);
		//assertEquals(data4, list.deleleFirst());
		//assertEquals(data3, list.deleleFirst());
		//assertEquals(data2, list.deleleFirst());
		//assertEquals(data1, list.deleleFirst());
		//assertEquals(data5, list.deleleFirst());
		//assertEquals(0, list.size);
	}


}
