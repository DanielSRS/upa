package br.uefs.ecomp.upa.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.uefs.ecomp.upa.util.Link;
import br.uefs.ecomp.upa.util.Queue;

public class CareQueueTest {

	private CareQueue care;
	Doctor doctor1, doctor2, doctor3, doctor4, doctor5, doctor6;
	Link newLink1, newLink2, newLink3, newLink4, newLink5, newLink6;
	
	@BeforeEach
	void setup() {
		care = new CareQueue();
		doctor1 = new Doctor("sad", "123456");
		doctor2 = new Doctor("not happy", "654321");
		doctor3 = new Doctor("unhappy", "78990");
		doctor4 = new Doctor("little sad", "09987");
		doctor5 = new Doctor("super sad", "978243");
		doctor6 = new Doctor("saddest", "780094");
		
		newLink1 = new Link(doctor1, 0);
		newLink2 = new Link(doctor2, 0);
		newLink3 = new Link(doctor3, 0);
		newLink4 = new Link(doctor4, 0);
		newLink5 = new Link(doctor5, 0);
		newLink6 = new Link(doctor6, 0);
		
	}
	
	@Test
	void instanceTest() 
		{
		assertEquals(0, care.numberOfDoctors());
		}
	
	@Test
	void addDoctorTest() 
		{
		care.addDoctor(newLink1);
		
		assertEquals(1, care.numberOfDoctors());
		assertEquals(doctor1, (Doctor) care.listDoctors().data);
		
		care.addDoctor(newLink2);
		
		assertEquals(2, care.numberOfDoctors());
		assertEquals(doctor2, (Doctor) care.listDoctors().next.data);
		}
	
	@Test
	void addPatientTest() 
		{
		Patient p = new Patient("big sad", "475273");
		Patient t;
		Link q = new Link(p, 0);
		String l = "Matriculas de pacientes na espera \n\n475273\n";
		boolean b;
		
		care.addDoctor(newLink1);
		care.addPatience(q);
		t = ( (Patient) ((Queue) (care.listDoctors().data2)).listAll().data);
		
		assertEquals(t, p);
		
		b = care.listQueue(doctor1.getCRM()).equals(l);
		assertTrue(b);
		}
	
	@Test
	void listQueueTest() 
		{
		care.addDoctor(newLink1);
		
		
		}

}
