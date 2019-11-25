package br.uefs.ecomp.upa.model;

public class Patient {
    private String name;
    private String registration;
    
    public Patient(String name, String registration) {
    	this.name =  name;
    	this.registration = registration;
    }
    public String getName() {
    	return this.name;
    }
    public String getRegistration() {
    	return this.registration;
    }
}
