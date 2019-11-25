package br.uefs.ecomp.upa.model;

public class Doctor {
    private String name;
    private String crm;
    
    public Doctor(String name, String crm) {
    	this.name = name;
    	this.crm = crm;
    }
    
    public void setName(String newName) {
    	this.name = newName;
    }
    public String getName() {
    	return this.name;
    }
    public String getCRM() {
    	return this.crm;
    }
}
