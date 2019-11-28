package br.uefs.ecomp.upa.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author Daniel Santa Rosa Santos
 *
 */
public class LinkListTest 
	{

	LinkList list;
	Link data1, data2, data3, data4, data5;
	
	@BeforeEach
	public void setup() 
		{
		list = new LinkList();
		data1 = new Link(2, 0);
		data2 = new Link(3, 2);
		data3 = new Link(4, 1);
		data4 = new Link(1, 3);
		data5 = new Link(0, 0);
		}
	
	@Test
	public void instaceTest() 
		{
		assertFalse(list == null);
		}
	
/*	@Test
	public void insertFirstTest() {
		list.insertFirst(data1);
		list.insertFirst(data2);
		list.insertFirst(data3);
		list.insertFirst(data4);
		
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
		list.insertFirst(data1);
		list.insertFirst(data2);
		list.insertFirst(data3);
		list.insertFirst(data4);
		list.insertLast(data5);
		
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
	
	@Test
	public void deletFirstTest() {
		list = new LinkList();
		list.insertFirst(data2);
		list.insertFirst(data3);
		list.insertFirst(data5);
		list.insertFirst(data1);
		list.insertLast(data4);
		
		
		assertEquals(5, list.size);
		assertEquals(data1, list.deleleFirst());
		assertEquals(data5, list.deleleFirst());
		assertEquals(data3, list.deleleFirst());
		assertEquals(data2, list.deleleFirst());
		assertEquals(data4, list.deleleFirst());
		assertEquals(0, list.size);
	} */
	
	@Test
	public void insertTest() 
		{
		list = new LinkList();
		
		assertEquals(0, list.size);
		assertNull(list.getFirst());
		
		list.insert(data1);
		list.insert(data2);
		list.insert(data3);
		list.insert(data4);
		list.insert(data5);
		
		Link x = list.getFirst();
		
		assertEquals(data4, list.getLast());
		
		assertEquals(data1, x);
		x = x.next;
		assertEquals(data5, x);
		x = x.next;
		assertEquals(data3, x);
		x = x.next;
		assertEquals(data2, x);
		x = x.next;
		assertEquals(data4, x);
		x = x.next;
		assertNull(x);
		
		}


}
