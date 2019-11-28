package br.uefs.ecomp.upa.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.uefs.ecomp.upa.util.Link;

/**
 * 
 * @author Daniel Santa Rosa Santos
 *
 */
class RegistryTest {
	Registry reg;
	Doctor doctor1, doctor2, doctor3, doctor4, doctor5, doctor6;
	Link newLink1, newLink2, newLink3, newLink4, newLink5, newLink6;

	@Test
	void setup() 
		{
		reg = new Registry();
		
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
	void addDoctorTest() 
		{
		this.reg.addDoctor(doctor1);
		}
	

}
