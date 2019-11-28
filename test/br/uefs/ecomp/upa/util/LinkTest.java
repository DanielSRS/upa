package br.uefs.ecomp.upa.util;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkTest 
	{
	Link link;
	
	@BeforeEach
	public void setup() 
		{
		link = new Link(4, 2);
		} 
	
	@Test
	public void test() 
		{
		assertNull(link.next);
		assertEquals(4, link.data);
		assertEquals(2, link.priority);
		}
	
	
	}
