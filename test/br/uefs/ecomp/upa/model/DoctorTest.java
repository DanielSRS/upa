package br.uefs.ecomp.upa.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Daniel Santa Rosa Santos
 *
 */
public class DoctorTest {
    
	Doctor doctor;
	Object data1, data2;
	
	@BeforeEach
	void setup() {
		data1 = "Daniel";
		data2 = "789634";
		doctor = new Doctor((String) data1, (String) data2);
	}
	
	@Test
	void creatTest() {
		assertEquals((String) data1, doctor.getName());
		assertEquals((String) data2, doctor.getCRM());
	}
	
	@Test
	void setNameTest() {
		doctor.setName("Vernon");
		assertEquals((String) "Vernon", doctor.getName());
		assertEquals((String) data2, doctor.getCRM());
	}

}
